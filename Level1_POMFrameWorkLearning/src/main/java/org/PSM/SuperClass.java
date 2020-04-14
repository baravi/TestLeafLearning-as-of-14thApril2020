package org.PSM;

import org.testng.annotations.Test;
import org.utils.ReadExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class SuperClass {
	public static ChromeDriver driver;
	public String excelName;

	@Parameters({ "url" })
	@BeforeMethod
	public void loginLeafTaps(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@DataProvider
	public String[][] getExcelData() throws IOException {
		return new ReadExcel().readExcel(excelName);

	}
	
	@AfterMethod
	public void closeBroser() {
		driver.close();
	}
}
