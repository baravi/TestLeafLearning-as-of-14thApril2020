package pageClass;

import java.util.concurrent.TimeUnit;

import org.PSM.SuperClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends SuperClass {

	public LoginPage enterUserName(String data)  {
		
System.out.println(data);

		driver.findElementById("username").sendKeys(data);

		return this;
	}

	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
		/*
		 * // or HomePage hp = new HomePage(); return hp;
		 */

	}

}
