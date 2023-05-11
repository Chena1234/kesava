package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Global;

public class Tc_001 {
	@Test
	public void tc001() throws Exception {

//	public static void main(String[] args)throws Exception {
		Global obj = new Global();
		DOMConfigurator.configure("log4j.xml");
		
		obj.openApplication();
		obj.login();
		obj.enter_fram();
		obj.addEmp();
		obj.exit_fram();
		obj.logout();
		obj.closeApplication();
		
		
		
		
		

	}

}
