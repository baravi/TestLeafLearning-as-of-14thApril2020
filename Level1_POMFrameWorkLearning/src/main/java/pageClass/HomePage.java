package pageClass;

import org.PSM.SuperClass;

public class HomePage extends SuperClass {

	public MyHomePage clickCrmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
