package com.bigsword.eleave.leave.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.bigsword.eleave.db.spi.LeaveRequestDbService;
import com.bigsword.eleave.domain.Authentication;
import com.bigsword.eleave.domain.LeaveProfile;
import com.bigsword.eleave.domain.LeaveRequest;
import com.bigsword.eleave.domain.User;
import com.bigsword.eleave.user.spi.UserBpmService;

public class UserBpmServiceImpl implements UserBpmService {
	
	private LeaveRequestDbService leaveRequestDbService;
	
	@Override
	public User login(Authentication authentication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LeaveProfile retrieveLeaveProfile(String staffId, Date year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LeaveRequest> retrieveLeaveFromMe(String staffId, Date year) {
		
		Date begin;
		Date end;
		Calendar cal = Calendar.getInstance();
		cal.setTime(year);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		begin=cal.getTime();
		
		cal.setTime(year);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 31);
		end=cal.getTime();
		
		List<LeaveRequest> leaveRequests=leaveRequestDbService.getLeaveRequest(staffId,begin,end);
		return leaveRequests;
	}

	@Override
	public List<LeaveRequest> retrieveLeavesOnMe(String staffId, Date year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User retrieveUserDetail(String staffId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLeaveRequestDbService(LeaveRequestDbService leaveRequestDbService) {
		this.leaveRequestDbService = leaveRequestDbService;
	}

}
