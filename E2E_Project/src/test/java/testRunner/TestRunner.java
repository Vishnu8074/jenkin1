package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		glue = "stepDefinition")

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
