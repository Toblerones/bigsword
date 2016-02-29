package com.bigsword.eleave.domain;

import java.util.Date;

import com.bigsword.eleave.domain.constraints.LeaveTypeKey;

public class LeaveRequest {
	
	private String requestorId;
	
	private Date fromDate;
	private Date ToDate;
	
	private String leaveType;
	private boolean isCoreLeave;
	
	private String status;
	
	// Rich Domain
	public boolean isAnnualLeave(){
		return LeaveTypeKey.ANNUAL_LEAVE.equals(this.leaveType);
	}
}
