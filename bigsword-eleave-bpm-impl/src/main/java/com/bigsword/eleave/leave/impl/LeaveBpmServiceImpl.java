package com.bigsword.eleave.leave.impl;

import java.util.HashMap;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.bigsword.eleave.db.spi.LeaveRequestDbService;
import com.bigsword.eleave.domain.LeaveRequest;
import com.bigsword.eleave.domain.constraints.LeaveStatus;
import com.bigsword.eleave.leave.spi.LeaveBpmService;

public class LeaveBpmServiceImpl implements LeaveBpmService {
	private RuntimeService runtimeService;
	private TaskService taskService;
	private LeaveRequestDbService LeaveRequestDbService;
	private static String LEAVE_PROCESS_ID="AnnualLeave";
	
	@Override
	public Boolean draftLeave(LeaveRequest leaveRequest) {
		leaveRequest.setStatus(LeaveStatus.DRAFT);
		LeaveRequestDbService.addLeaveRequest(leaveRequest);
		return true;
	}

	@Override
	public Boolean submitLeave(LeaveRequest leaveRequest) {
		ProcessInstance leave=runtimeService.startProcessInstanceByKey(LEAVE_PROCESS_ID);
		boolean result=false;
		if(leave!=null){
			leaveRequest.setRequestId(leave.getId());
			leaveRequest.setStatus(LeaveStatus.SUBMIT);
			LeaveRequestDbService.updateLeaveRequest(leaveRequest);
			taskService.complete(leave.getId());
			result=true;
		}
		
		return result;
	}

	@Override
	public Boolean cancelLeave(LeaveRequest leaveRequest,String userId) {
		boolean result=false;
		Task leave=taskService.createTaskQuery().taskId(leaveRequest.getRequestId()).singleResult();
		if(leave!=null && leaveRequest.getRequestorId().equals(userId)){
			//Todo. need to study 
			HashMap<String, Object> calcelMap = new HashMap<String, Object>();
			calcelMap.put("cancelLeave", true);
	        taskService.complete(leave.getId(),calcelMap);
	        
			leaveRequest.setStatus(LeaveStatus.CANCEL);
			LeaveRequestDbService.updateLeaveRequest(leaveRequest);
			result=true;
		}
		return result;
	}

	@Override
	public Boolean approveLeave(LeaveRequest leaveRequest,String userId) {
		boolean result=false;
		Task leave=taskService.createTaskQuery().taskId(leaveRequest.getRequestId()).singleResult();
		if(leave!=null && (leave.getAssignee().equals(userId)||leave.getOwner().equals(userId))){
			HashMap<String, Object> approveMap = new HashMap<String, Object>();
			approveMap.put("vacationApproved", true);
	        taskService.complete(leave.getId(),approveMap);
	        leaveRequest.setStatus(LeaveStatus.APPROVE);
	        LeaveRequestDbService.updateLeaveRequest(leaveRequest);
	        result=true;
		}
		return result;
	}

	@Override
	public Boolean declineLeave(LeaveRequest leaveRequest,String userId) {
		boolean result=false;
		Task leave=taskService.createTaskQuery().taskId(leaveRequest.getRequestId()).singleResult();
		if(leave!=null && (leave.getAssignee().equals(userId)||leave.getOwner().equals(userId))){
			HashMap<String, Object> rejectMap = new HashMap<String, Object>();
			rejectMap.put("vacationApproved", false);
	        taskService.complete(leave.getId(),rejectMap);
	        leaveRequest.setStatus(LeaveStatus.REJECT);
	        LeaveRequestDbService.updateLeaveRequest(leaveRequest);
	        result=true;
		}
		return result;
	}

	public void setRuntimeService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public void setLeaveRequestDbService(LeaveRequestDbService leaveRequestDbService) {
		LeaveRequestDbService = leaveRequestDbService;
	}

	public static void setLEAVE_PROCESS_ID(String lEAVE_PROCESS_ID) {
		LEAVE_PROCESS_ID = lEAVE_PROCESS_ID;
	}

}
