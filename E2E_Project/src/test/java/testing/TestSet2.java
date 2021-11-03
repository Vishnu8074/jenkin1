package testing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.com.Base;

import pageObjects.HomePage;
public class TestSet2 extends Base{	
	public static Logger log =  LogManager.getLogger(TestSet1.class.getName());
	
	@Test()
	public void validateTitle() throws IOException {
		driver = invokeBrowser();
		String url = prop.getProperty("url");
		driver.get(url);
		HomePage h = new HomePage(driver);
		Assert.assertEquals(h.getTitle().getText(), "FEATURED COURSES");
		log.info("Title is Validated!");
		driver.close();
		driver=null;
	}
}

