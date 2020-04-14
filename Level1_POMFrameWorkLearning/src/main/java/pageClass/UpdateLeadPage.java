package pageClass;

import org.PSM.SuperClass;

public class UpdateLeadPage extends SuperClass {
	public ViewLeadPage editCompanyName(String data) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(data);
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
		
		
		
		
	}

}
