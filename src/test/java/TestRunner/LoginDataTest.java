package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\Features\\LoginWithData.feature"},glue="Step_Definition")
public class LoginDataTest {

}
