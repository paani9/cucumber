package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver=null;
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("^Enter the Url$")
	public void enter_the_Url() throws Throwable {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^enter the valid username and password$")
	public void enter_the_valid_username_and_password() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("^check the home page is displayed$")
	public void check_the_home_page_is_displayed() throws Throwable {
	  String S = driver.getTitle();
	  System.out.println(S);
	}
	
}
