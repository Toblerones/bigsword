package com.bigsword.eleave.db.spi;

import com.bigsword.eleave.domain.LeaveProfile;

public interface LeaveProfileDbServices {
	public LeaveProfile getLeaveProfile(String userId, String leaveType);
	public void updateLeaveProfile(String userId, String leaveType, int days);
	public void addLeaveProfile(LeaveProfile leaveProfile);
	public void deleteLeaveProfile(String userId);
}
