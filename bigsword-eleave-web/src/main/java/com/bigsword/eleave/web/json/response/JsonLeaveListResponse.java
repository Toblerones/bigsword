package com.bigsword.eleave.web.json.response;

import com.bigsword.eleave.web.json.base.ResponseBase;
import com.bigsword.eleave.web.json.object.JsonObjLeaveList;

public class JsonLeaveListResponse extends ResponseBase{
	private JsonObjLeaveList data;

	public JsonObjLeaveList getData() {
		return data;
	}

	public void setData(JsonObjLeaveList data) {
		this.data = data;
	}
	
	
}
