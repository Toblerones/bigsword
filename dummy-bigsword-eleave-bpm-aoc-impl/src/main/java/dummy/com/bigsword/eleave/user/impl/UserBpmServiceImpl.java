package dummy.com.bigsword.eleave.user.impl;

import java.util.Date;
import java.util.List;

import com.bigsword.eleave.domain.LeaveProfile;
import com.bigsword.eleave.domain.LeaveRequest;
import com.bigsword.eleave.domain.User;
import com.bigsword.eleave.user.spi.UserBpmService;

public class UserBpmServiceImpl implements UserBpmService{

	public User logon(String username, String password, String channelCode) {
		User user = new User();
		user.setFirstName("dummyFirstName");
		user.setLastName("dummyLastName");
		user.setStaffId("99998888");
		user.setEmail("dummy@dummy.com");
		return user;
	}

	public LeaveProfile retrieveLeaveProfile(String staffId, Date year) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LeaveRequest> retrieveLeaveFromMe(String staffId, Date year) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LeaveRequest> retrieveLeavesOnMe(String staffId, Date year) {
		// TODO Auto-generated method stub
		return null;
	}

	public User retrieveUserDetail(String staffId) {
		// TODO Auto-generated method stub
		return null;
	}

}
