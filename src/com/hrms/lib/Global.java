package com.hrms.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class Global extends Genral {
	// standerd rule 2: to provide all re-useble methods/fun for whole application;
	
	public void openApplication() throws Exception {
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("open Application");
		Log.info("Application Opened");
		Thread.sleep(2000);
	}
	public void closeApplication() {
		driver.close();
		System.out.println("close Application");
		Log.info("Application Closed");
	}
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
		Thread.sleep(3000);
		
	}
	public void logout() throws Exception{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout Completed");
		Thread.sleep(3000);
	}
	public void enter_fram()throws Exception {
		driver.switchTo().frame(fram_empinfo);
		System.out.println("enter into the frame");
		Log.info("Entered into Frame");
		Thread.sleep(3000);
	}
	public void exit_fram()throws Exception {
		driver.switchTo().defaultContent();
		System.out.println("exit from the frame");
		Log.info("Exit From the Frame");
		Thread.sleep(3000);
	}
	public void addEmp()throws Exception {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(fn_val)).sendKeys(fst_name);
		driver.findElement(By.name(ln_val)).sendKeys(lst_name);
		driver.findElement(By.id(btn_save)).click();
		Log.info("Addind Employee Completed");
		Thread.sleep(3000);
	}
	public void editEmp()throws Exception {
		driver.findElement(By.xpath(select_name)).click();
		driver.findElement(By.name(btn_edit)).click();
		driver.findElement(By.name(first_name)).clear();
		driver.findElement(By.name(last_name)).clear();
		driver.findElement(By.name(first_name)).sendKeys(fst_name);
		driver.findElement(By.name(last_name)).sendKeys(lst_name);
		driver.findElement(By.name(first_name)).click();
		Log.info("Employee Edited");
		Thread.sleep(3000);
	}
	
	public void deleteEmp()throws Exception {
		Select sc = new Select(driver.findElement(By.name(txt_select)));
		sc.selectByIndex(1);
		driver.findElement(By.name(txt_search)).sendKeys(search);
		driver.findElement(By.xpath(btn_search)).click();
		driver.findElement(By.name(box_check)).click();
		driver.findElement(By.xpath(btn_delete)).click();
		Log.info("Employee Deleted");
		Thread.sleep(3000);
		
	}	
	}

	

	

