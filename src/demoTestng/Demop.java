package demoTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demop {
	@Test(dependsOnMethods = { "chat", "findfriends" })
	public void logout() {
		Reporter.log("tc1", true);

	}

	@Test(priority = 1)
	public void login() {
		Reporter.log("tc2", true);
	}

	@Test(dependsOnMethods = "findfriends")
	public void chat() {
		Reporter.log("tc3", true);

	}

	@Test(dependsOnMethods = "login")
	public void editprofile() {
		Reporter.log("tc4", true);

	}

	@Test(dependsOnMethods = "editprofile")
	public void findfriends() {
		Reporter.log("tc5", true);
		Assert.fail();
	}
}
