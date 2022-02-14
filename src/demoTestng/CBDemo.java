package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBDemo {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void tc(String bname) {
		if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			driver = null;
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
