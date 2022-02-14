package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
	@FindBy(name="q")
	private WebElement search;
	
	
	
	public Google(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public void sendText(String txt) {
		search.sendKeys(txt, Keys.ENTER);
	}

}
