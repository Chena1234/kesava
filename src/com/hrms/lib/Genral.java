package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Genral {

	// standerd rule 1 : to provide testdata & object for whole application;
	public WebDriver driver;
	
//*************test data**********
	
	public String url        =  "http://183.82.103.245/nareshit/login.php";
	public String un         =   "nareshit";
	public String pw         =   "nareshit";
	public String  fn        =  "Suresh";
	public String ln         =   "Selenium";
	public String fst_name   =   "kesava";
	public String lst_name   =   "beluguppa";
	public String search     =  "10014";
	
	//***********objects/Elements********
	// Login into application;
	
	public String txt_loginname  = "txtUserName";
	public String txt_password   = "txtPassword";
	public String btn_login      =  "Submit";
	public String link_logout    =  "Logout";
	
	//Fram
	
	public String fram_empinfo   =  "rightMenu";
	
	
	// Add Employee
	
	
	public String btn_add        = "//input[@value='Add']";
	public String btn_save       = "btnEdit";
	public String ln_val         ="txtEmpLastName";
	public String fn_val         ="txtEmpFirstName";
	
	// Edit Employee;
	
	//public String select_name    = "Naveen Jada";
	//public String btn_Edit       = "//input[@title = 'Edit'][@type = 'button']";
	//public String first_name     = "//input[@type = 'text'][@id = 'txtEmpFirstName']";
	//public String last_name      = "//input[@type = 'text'][@id = 'txtEmpLastName']";
	//public String Save_btn       = "//input[@title = 'Save'][@type = 'button']";
	
	
	public String select_name    = "//*[@id=\"standardView\"]/table/tbody/tr[2]/td[3]/a";
	public String btn_edit       = "EditMain";
	public String first_name     = "txtEmpFirstName";
	public String last_name      = "txtEmpLastName";
	public String save_btn       = "EditMain";
	
	// Delete employee;
	
	public String txt_select      = "loc_code";
	public String txt_search      = "loc_name";
	public String btn_search      = "//*[@id=\"standardView\"]/div[2]/input[2]";
	public String box_check       = "chkLocID[]";
	public String btn_delete      = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
	
	
	
	
	
	
	
	
	
		

	}


