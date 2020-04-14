package org.TestCases;

import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClass.LoginPage;

public class TC005_DuplicateLead extends SuperClass {
	
	@BeforeTest
	public void setExcelName() {
		excelName ="TC005_DuplicateLead";
	}

	@Test(dataProvider = "getExcelData")
	public  void duplicateLead(String uNmae,String pwd,String searchText) throws InterruptedException {
		new LoginPage().enterUserName(uNmae).enterPassword(pwd).clickLoginButton().clickCrmSfa().clickLead().clickFindLead()
		.searchLeadByName(searchText).clickFirstLead().clickDuplicate().createDuplicateLead();
		
		
//		driver.findElementByLinkText("Leads").click();
//		driver.findElementByLinkText("Find Leads").click();
//		driver.findElementByXPath("//span[text()='Phone']").click();
//		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//		driver.findElementByLinkText("Duplicate Lead").click();
//		driver.findElementByName("submitButton").click();
		}
}






