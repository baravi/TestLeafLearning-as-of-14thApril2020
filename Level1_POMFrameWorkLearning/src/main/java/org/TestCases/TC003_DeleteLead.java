package org.TestCases;
import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClass.LoginPage;



public class TC003_DeleteLead extends SuperClass {
	
	@BeforeTest
	public void setExcelName() {
		
		excelName ="TC003_DeleteLead";
	}
@Test(dataProvider = "getExcelData")
	public  void deleteLead(String uName,String pwd,String searchText) throws InterruptedException {	
	
	new LoginPage().enterUserName(uName).enterPassword(pwd).clickLoginButton().clickCrmSfa().clickLead().clickFindLead().searchLeadByName(searchText)
	.clickFirstLead().clickDelete();
	
	
	
//		driver.findElementByLinkText("Leads").click();
//		driver.findElementByLinkText("Find Leads").click();
//		driver.findElementByXPath("//span[text()='Phone']").click();
//		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);
//		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
//		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
//		driver.findElementByLinkText("Delete").click();
//		driver.findElementByLinkText("Find Leads").click();
//		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		String text = driver.findElementByClassName("x-paging-info").getText();
//		if (text.equals("No records to display")) {
//			System.out.println("Text matched");
//		} else {
//			System.out.println("Text not matched");
//		}
		
}
}






