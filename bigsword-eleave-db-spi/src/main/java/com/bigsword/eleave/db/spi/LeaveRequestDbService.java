package com.bigsword.eleave.db.spi;

import java.util.Date;
import java.util.List;

import com.bigsword.eleave.domain.LeaveRequest;

public interface LeaveRequestDbService {
	public List<LeaveRequest> getLeaveRequest(String userId);
	public List<LeaveRequest> getLeaveRequest(String userId, String leaveType);
	public List<LeaveRequest> getLeaveRequest(String userId, Date beginDate, Date endDate);
	public LeaveRequest getLeaveRequestById(String Id);
	public void addLeaveRequest(LeaveRequest leaveRequest);
	public void updateLeaveRequest(LeaveRequest leaveRequest);
	public void deleteLeaveRequest(String Id);
}
