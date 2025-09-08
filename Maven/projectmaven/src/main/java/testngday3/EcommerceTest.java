package testngday3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class EcommerceTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();
	}
	@Test(groups = {"smoke"})
	public void testTitle() {
	    System.out.println("Smoke Test-Title Check");
	    System.out.println("Page Title: " + driver.getTitle());
	    
	}
	@Test(groups = {"regression"})
	public void testSearch() throws IOException, InterruptedException {
	    System.out.println("Regression Test-Search");
	    Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        props.load(fis);

        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        
        WebElement emailField = driver.findElement(By.id("ap_email_login"));
        emailField.sendKeys(email);
        driver.findElement(By.id("continue")).click();

       
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        
        
        Thread.sleep(30000);
	}

	@Test(groups = {"sanity"})
	public void testCart() {
	    System.out.println("Sanity + Regression- Cart Test");
	}

	@AfterClass
	public void teardown() {
	    driver.quit();
	}



}
