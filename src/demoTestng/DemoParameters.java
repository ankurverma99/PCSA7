package demoTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParameters {

	@Test(invocationCount = 5)
	public void tc_01() {
		Reporter.log("tc1", true);

	}

	@Test(enabled = false) 
	public void tc_02() {
		Reporter.log("tc2", true);

	}

	@Test
	public void tc_03() {
		Reporter.log("tc3", true);

	}

}
