package demoTestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	@BeforeMethod
	public void bm() {
		Reporter.log("BM", true);
	}

	@AfterMethod
	public void am() {
		Reporter.log("AM", true);

	}

	@BeforeClass
	public void beforeC() {
		Reporter.log("BeforC", true);
	}

	@AfterClass
	public void afterC() {
		Reporter.log("ac", true);
	}

	@BeforeTest
	public void BT() {
		Reporter.log("BT", true);
	}

	@AfterTest
	public void AT() {
		Reporter.log("AT", true);
	}

	@BeforeSuite
	public void BS() {
		Reporter.log("Bs", true);
	}

	@AfterSuite
	public void AS() {
		Reporter.log("As", true);
	}

	@Test
	public void tc_01() {
		Reporter.log("test1", true);
	}

	@Test
	public void tc_02() {
		Reporter.log("test2", true);
	}
}
