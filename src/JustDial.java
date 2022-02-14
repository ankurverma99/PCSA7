import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class JustDial {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);

		FirefoxProfile ff = new FirefoxProfile();
		ff.setPreference("dom.webnotifications.enabled", false);
		FirefoxOptions fo = new FirefoxOptions();
		fo.setProfile(ff);
		WebDriver driver1 = new FirefoxDriver(fo);

		driver1.manage().window().maximize();
		driver1.get("https://www.justdial.com/");
	}
//hello..
}
