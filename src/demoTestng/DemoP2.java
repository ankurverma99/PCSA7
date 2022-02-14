package demoTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoP2 {
	@Test(priority = 4)
	public void tc_01() {
		Reporter.log("tc1", true);

	}

	@Test(priority = 1)
	public void tc_02() {
		Reporter.log("tc2", true);

	}

	@Test(priority = -3)
	public void tc_03() {
		Reporter.log("tc3", true);

	}
}
