import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/WebDriverWait%20Examples/sam1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("textA")).sendKeys("name");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("textA")).getAttribute("value"));
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		ww.until(new ExpectedCondition<Boolean>() {
			
			@Override 
			public Boolean apply(WebDriver d) {
				WebElement ele = d.findElement(By.name("textA"));
				return ele.getAttribute("value").equalsIgnoreCase("name");
			}
		});
		driver.findElement(By.name("textB")).sendKeys("Ankur");
	}
	//black day for india(pulvama)

}
