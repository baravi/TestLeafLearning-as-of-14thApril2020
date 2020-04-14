package pageClass;

import org.PSM.SuperClass;

public class CreateLeadPage extends SuperClass {

	public CreateLeadPage enterCName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

		return this;
	}

	public CreateLeadPage enterFName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);

		return this;
	}

	public CreateLeadPage enterLName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		return this;
	}

	public ViewLeadPage clickCreateLead() {
		driver.findElementByName("submitButton").click();

		return new ViewLeadPage();
	}

}
