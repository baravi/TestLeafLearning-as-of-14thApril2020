package org.TestCases;

import org.PSM.SuperClass;
import org.testng.annotations.Test;

public class TC001 extends SuperClass {
	
  @Test(dataProvider ="getExcelData")  
  public void TC001_Login(String name,String fname,String lname) {  
	  System.out.println(name+fname+lname);
	  
	  
  }
}
