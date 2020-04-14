package org.TestCases;

import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClass.LoginPage;

public class TC002_EditLead extends SuperClass {
	
	@BeforeTest
	public void setExcelName() {
		excelName="TC002_EditLead";
	}

	@Test(dataProvider ="getExcelData")
	public void editLead(String uNmae, String pwd, String searchText, String companyName) throws InterruptedException {

		new LoginPage().enterUserName(uNmae).enterPassword(pwd).clickLoginButton().clickCrmSfa().clickLead()
				.clickFindLead().searchLeadByName(searchText).clickFirstLead().clickEdit().editCompanyName(companyName)
				.verifyCompanyName(companyName);

	}
}
