package pageClass;

import org.PSM.SuperClass;

public class MyHomePage extends SuperClass {

	public MyLeadsPage clickLead() {
		driver.findElementByLinkText("Leads").click();

		MyLeadsPage mlp = new MyLeadsPage();
		return mlp;

	}

}
