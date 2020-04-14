package org.TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClass.LoginPage;

public class TC004_MergeLead extends SuperClass {
	
	@BeforeTest
	public void setExcelName() {
		excelName ="TC004_MergeLead";
	}

	@Test(dataProvider = "getExcelData")
	public void mergeLead(String uName,String pwd,String fromLead,String toLead) throws InterruptedException {
		new LoginPage().enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLead().clickMergeLead().enterFromLead(fromLead).enterToLead(toLead).clickMergeButton().acceptAlert().verifyFirstName(fromLead);
		
//		driver.findElementByXPath("//img[@alt='Lookup']").click();
//		Set<String> allWindows = driver.getWindowHandles();
//		List<String> allhandles = new ArrayList<>(allWindows);
//		driver.switchTo().window(allhandles.get(1));
//		driver.findElementByXPath("//input[@name='firstName']").sendKeys("gopi");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(1000);
//		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//		driver.switchTo().window(allhandles.get(0));
//
//		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
//		Set<String> allWindows2 = driver.getWindowHandles();
//		List<String> allhandles2 = new ArrayList<>(allWindows2);
//		driver.switchTo().window(allhandles2.get(1));
//		driver.findElementByXPath("//input[@name='firstName']").sendKeys("babu");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//		driver.switchTo().window(allhandles2.get(0));
//		driver.findElementByXPath("//a[text()='Merge']").click();
//		driver.switchTo().alert().accept();
//
//		driver.findElementByLinkText("Find Leads").click();
//		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		String text = driver.findElementByClassName("x-paging-info").getText();
//		if (text.equals("No records to display")) {
//			System.out.println("Text matched");
//		} else {
//			System.out.println("Text not matched");
//		}
//
//	}
}
}
