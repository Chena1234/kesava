package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Global;

public class Tc_002 {
	@Test
	public void tc_002 ()throws Exception {

	//public static void main(String[] args) throws Exception {
		Global obj = new Global();
		DOMConfigurator.configure("log4j.xml");
		
		obj.openApplication();
		Thread.sleep(3000);
		obj.login();
		Thread.sleep(3000);
		obj.enter_fram();
		Thread.sleep(3000);
		obj.editEmp();
		Thread.sleep(3000);
		obj.exit_fram();
		Thread.sleep(3000);
		obj.logout();
		Thread.sleep(3000);
		obj.closeApplication();
		Thread.sleep(3000);

	}

}
