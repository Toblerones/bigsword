package com.bigsword.eleave.user.spi;

import java.util.Date;
import java.util.List;

import com.bigsword.eleave.domain.LeaveProfile;
import com.bigsword.eleave.domain.LeaveRequest;
import com.bigsword.eleave.domain.User;

public interface UserBpmService {
	
	public LeaveProfile retrieveLeaveProfile(String staffId, Date year);
	
	public List<LeaveRequest> retrieveLeaveFromMe(String staffId, Date year);
	public List<LeaveRequest> retrieveLeavesOnMe(String staffId, Date year);
	
	public User retrieveUserDetail(String staffId);
}
