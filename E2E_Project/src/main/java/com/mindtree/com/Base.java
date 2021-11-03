package com.mindtree.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver invokeBrowser() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthy\\eclipse-workspace\\E2E_Project\\src\\main\\java\\com\\mindtree\\com\\mydata.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\E2E_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	public void getScreenshots(String name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\SeleniumTests\\"+name+"screenshot.png"));
	}
}
