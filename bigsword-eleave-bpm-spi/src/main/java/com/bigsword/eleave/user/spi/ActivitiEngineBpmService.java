package com.bigsword.eleave.user.spi;

import java.util.List;

public interface ActivitiEngineBpmService {
	public List<Object> getRunningSystemsList();
	
	public Boolean deployWorkflowSystem(String systemKey);
	
	public Boolean getRunningSystemId();
	
	public Boolean shutDownWorkFlowSystem(String systemKey);
}
