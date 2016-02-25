package com.bigsword.eleave.web.processors.leave;

import org.apache.log4j.Logger;

import com.bigsword.eleave.web.processors.authentication.LogonProcessor;
import com.github.toblerones.web.app.base.processor.RequestProcessor;
import com.github.toblerones.web.app.context.WorkContext;

public class LeaveListProcessor implements RequestProcessor{

	final static Logger logger = Logger.getLogger(LogonProcessor.class);
	
	@Override
	public String process(WorkContext workContext) {
		System.out.println("in LeaveListProcessor");
		return "DONE";
	}

}
