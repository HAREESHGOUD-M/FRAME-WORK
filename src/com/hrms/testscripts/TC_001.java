package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	@Test
	public void tc001() throws Exception {
		General obj =new General();
		obj.openapplication();
		obj.loginintoapplication();
		obj.logoutintoaplication();
		
		
	}
	
	
}
