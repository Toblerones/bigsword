package com.bigsword.eleave.web.processors.leave;

import org.apache.log4j.Logger;

import com.bigsword.eleave.web.processors.authentication.LoginProcessor;
import com.github.toblerones.web.app.base.processor.RequestProcessor;
import com.github.toblerones.web.app.context.WorkContext;

public class LeaveListProcessor implements RequestProcessor{

	final static Logger logger = Logger.getLogger(LoginProcessor.class);
	
	@Override
	public String process(WorkContext workContext) {
		System.out.println("in LeaveListProcessor");
		return "DONE";
	}

}
