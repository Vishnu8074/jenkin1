package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.com.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.LoginPage;


@RunWith(Cucumber.class)
public class StepDefinition extends Base{

    @Given("^invoke the chrome driver$")
    public void invoke_the_chrome_driver() throws Throwable {
    	driver = invokeBrowser();
    }

    @When("^user enters (.+) and (.+) and submit$")
    public void user_enters_and_and_submit(String username, String password) throws Throwable {
    	LoginPage lp = new LoginPage(driver);
    	lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
    }

    @Then("^verify that user is unable to log into the application$")
    public void verify_that_user_is_unable_to_log_in() throws Throwable {
    	//write some code
    	System.out.println("User is unable to login");
    }

    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^click on login$")
    public void click_on_login() throws Throwable {
    	HomePage h = new HomePage(driver);
		h.getLogin().click();
    }

}