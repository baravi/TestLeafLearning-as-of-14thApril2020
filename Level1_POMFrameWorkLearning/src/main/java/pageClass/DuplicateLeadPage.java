package pageClass;

import org.PSM.SuperClass;

public class DuplicateLeadPage extends SuperClass {
	
	public DuplicateLeadPage createDuplicateLead() {
		driver.findElementByName("submitButton").click();
		return this;
		
		
		
	}

}
