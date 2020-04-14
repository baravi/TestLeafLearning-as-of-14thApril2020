package pageClass;

import org.PSM.SuperClass;

public class MyLeadsPage extends SuperClass {

	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();

	}
	
	public FindLeadPage clickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();		
	}
	public MergeLeadPage clickMergeLead() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();		
	}

}
