package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import OrangeHRMJai.OrangeHRMJai.FunOrange;

public class TESTClass {
	WebDriver dr;FunOrange Func;
	 
	  @Test(dataProvider = "dp")
	  public void f(String n, String s) {
		 Func=new FunOrange(dr);  
		 Func.login();
	     Func.Funct(n,s);
	     
	  }

	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {new Object[] {"Admin","admin123"},new Object[] { "Test@12333", "54254" },
	    };
	}
}
