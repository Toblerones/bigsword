package com.bigsword.eleave.domain;

import java.util.Date;

import com.bigsword.eleave.domain.constraints.LeaveType;

public class LeaveRequest {
	
	private String requestId;
	private String requestorId;
	
	private Date fromDate;
	private Date ToDate;
	
	private String leaveType;
	private boolean isCoreLeave;
	
	private String status;
	
	// Rich Domain
	public boolean isAnnualLeave(){
		return LeaveType.ANNUAL_LEAVE.equals(getLeaveType());
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestorId() {
		return requestorId;
	}

	public void setRequestorId(String requestorId) {
		this.requestorId = requestorId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return ToDate;
	}

	public void setToDate(Date toDate) {
		ToDate = toDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public boolean isCoreLeave() {
		return isCoreLeave;
	}

	public void setCoreLeave(boolean isCoreLeave) {
		this.isCoreLeave = isCoreLeave;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
