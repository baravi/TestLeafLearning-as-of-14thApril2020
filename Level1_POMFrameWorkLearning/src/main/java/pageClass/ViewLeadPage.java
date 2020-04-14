package pageClass;

import org.PSM.SuperClass;

public class ViewLeadPage extends SuperClass {

	public ViewLeadPage verifyFirstName(String data) throws InterruptedException {
		Thread.sleep(5000);
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.equals(data)) {
			System.out.println("CreateLead is success");

		} else {
			System.out.println("CreateLead is not success");
		}

		return this;
	}

	public ViewLeadPage verifyCompanyName(String data) throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		if (text.contains(data)) {
			System.out.println("EditLead is success");

		} else {
			System.out.println("EditLead is not success");
		}

		return this;
	}

	public void clickLogout() {
		driver.findElementByLinkText("Logout").click();

	}

	public UpdateLeadPage clickEdit() {
		driver.findElementByLinkText("Edit").click();
		return new UpdateLeadPage();

	}

	public void clickDelete() {
		driver.findElementByLinkText("Delete").click();
	}
	
	public DuplicateLeadPage clickDuplicate() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
		
	}

}
