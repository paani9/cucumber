package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"/Cucumber/src/test/java/Features/LoginPage.feature"},glue="Step_Definition")
public class LoginTest {
	
}
