import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/select.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		if (s.isMultiple()) {
			/*
			 * s.selectByIndex(0); s.selectByIndex(2);
			 */
			List<WebElement> opts = s.getOptions();
			for (WebElement opt : opts) {
				s.selectByVisibleText(opt.getText());
			}
		}
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		System.err.println("=======================");
		List<WebElement> allopts = s.getAllSelectedOptions();
		for (WebElement opt : allopts) {
			System.out.println(opt.getText());
		}
		//s.deselectByIndex(2);
		//s.deselectByVisibleText("misal pav");
		//s.deselectByValue("rosogola");
		s.deselectAll();
	}
}
