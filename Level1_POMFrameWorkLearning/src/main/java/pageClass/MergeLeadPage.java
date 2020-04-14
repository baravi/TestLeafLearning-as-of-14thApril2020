package pageClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.PSM.SuperClass;

public class MergeLeadPage extends SuperClass {
	
	public MergeLeadPage enterFromLead(String data) throws InterruptedException {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(data);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadPage enterToLead(String data) throws InterruptedException {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(data);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}
	
	public MergeLeadPage clickMergeButton() {
		driver.findElementByXPath("//a[text()='Merge']").click();
		return this;
		
	}
	
	public ViewLeadPage acceptAlert() {
		driver.switchTo().alert().accept();
		return new ViewLeadPage();
		
		
	}
	
	
	
}

	
	


