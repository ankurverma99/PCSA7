package demoTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGroup {
	@Test(groups = "functional")
	public void tc_f1() {
		Reporter.log("tcf1", true);

	}

	@Test(groups = "functional")
	public void tc_f2() {
		Reporter.log("tcf2", true);
		Assert.fail();
	}

	@Test(groups = "functional")
	public void tc_f3() {
		Reporter.log("tcf3", true);

	}

	@Test(groups = "intigration", dependsOnGroups = "functional")
	public void tc_i1() {
		Reporter.log("tci1", true);

	}

	@Test(groups = "intigration", dependsOnGroups = "functional")
	public void tc_i2() {
		Reporter.log("tci2", true);

	}

	@Test(groups = "intigration", dependsOnGroups = "functional")
	public void tc_i3() {
		Reporter.log("tci3", true);

	}

	@Test(groups = "system", dependsOnGroups = "intigration")
	public void tc_s1() {
		Reporter.log("tcs1", true);

	}

	@Test(groups = "system", dependsOnGroups = "intigration")
	public void tc_s2() {
		Reporter.log("tcs2", true);

	}
}
