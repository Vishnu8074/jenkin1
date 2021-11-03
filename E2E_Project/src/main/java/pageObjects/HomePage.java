package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
	public WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	By sign_in = By.xpath("//a[contains(@href,'sign_in')]");
	By title = By.xpath("//h2");
	public WebElement getLogin() throws IOException {
		return driver.findElement(sign_in);
	}
	public WebElement getTitle() throws IOException {
		return driver.findElement(title);
	}
	
}
