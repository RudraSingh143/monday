package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestngDemo2DoE {
	@Test(priority = 1,invocationCount = 7)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
@Test(priority = 2)
public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
@Test(priority = 3,dependsOnMethods = "modifyCustomer")
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);
}
}
