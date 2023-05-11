package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Global;
@Test
public class Tc_003 {
		
public void tc003() throws Exception {
	
		Global obj = new Global();
		DOMConfigurator.configure("log4j.xml");
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();

	}

}
