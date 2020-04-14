package pageClass;

import org.PSM.SuperClass;

public class FindLeadPage extends SuperClass {
	
	public FindLeadPage  searchLeadByName(String data) throws InterruptedException {
//		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(data);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		return this;
		
	}
		
		
		public ViewLeadPage clickFirstLead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		return new ViewLeadPage();
		
		
	}

}
