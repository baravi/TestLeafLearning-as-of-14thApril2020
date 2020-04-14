package org.TestCases;

import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageClass.LoginPage;


public class TC001_CreateLead extends SuperClass {
	
	@BeforeTest
	public String setExcelName() {
		
		return excelName ="TC001_CreateLead";
		
		
	}

@Test(dataProvider = "getExcelData")
	public void createLead(String uName,String pwd,String cName,String fName,String lName) throws InterruptedException   {
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLoginButton()	
	.clickCrmSfa()
	.clickLead()
	.clickCreateLead()
	.enterCName(cName)
	.enterFName(fName)
	.enterLName(lName)
	.clickCreateLead()
	.verifyFirstName(fName)
	.clickLogout();

	
 
		

	}
	
}
