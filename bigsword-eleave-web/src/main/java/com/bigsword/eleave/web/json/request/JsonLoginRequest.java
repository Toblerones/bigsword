package com.bigsword.eleave.web.json.request;

import com.bigsword.eleave.web.json.object.RequestBase;

public class JsonLoginRequest extends RequestBase{
	private String staffId;
	private String password;

	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
