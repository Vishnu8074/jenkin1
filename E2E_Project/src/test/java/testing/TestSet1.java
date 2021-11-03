package testing;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.com.Base;

import pageObjects.HomePage;
import pageObjects.LoginPage;
public class TestSet1 extends Base{	
	//public static Logger log =  LogManager.getLogger(TestSet1.class.getName());
	static Logger log = Logger.getLogger(Base.class);
	@Test(dataProvider="data")
	public void validateLogin(String uname,String pw) throws IOException {
		PropertyConfigurator.configure("C:\\Users\\Spoorthy\\eclipse-workspace\\E2E_Project\\src\\main\\resources\\log4j.properties");
		driver = invokeBrowser();
		String url = prop.getProperty("url");
		driver.get(url);
		HomePage h = new HomePage(driver);
		//h.driver = driver; Another way to initialize driver in HomePage class
		h.getLogin().click();
		log.info("Login page opened successfully");
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(uname);
		lp.getPassword().sendKeys(pw);
		lp.getLogin().click();
		log.info("Login credentials submited successfully!!");
		driver.close();
		driver=null;
	}
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "spoorthy";
		obj[0][1] = "12345";
		obj[1][0] = "deepthi";
		obj[1][1] = "dsf34";
		return obj;
	}
}

