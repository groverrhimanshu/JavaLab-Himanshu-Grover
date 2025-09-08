package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {
	WebDriver driver;
	 
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
 
	@When("I open the login page")
	public void i_open_the_login_page() {
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
 
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("groverhimanshu2001@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("kakudolu@19A");
	}
 
	@When("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(30000);
	}
 
	/*@Then("I sholud be navigated to the home page")
	public void i_should_be_navigated_to_the_home_page() {
		if (driver.findElements(By.id("nav-link-accountList")).size() > 0) {
			System.out.println("  Login Successful");
		} else {
			System.out.println(" Login Failed");
			driver.quit();
		}
	}*/

}
