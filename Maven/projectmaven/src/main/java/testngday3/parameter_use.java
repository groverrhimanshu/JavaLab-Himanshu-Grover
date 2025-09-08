package testngday3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameter_use {
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
	    if (browser.equalsIgnoreCase("chrome")) {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    driver.manage().window().maximize();
	}

	@Parameters("url")
	@Test(priority = 1)
	public void openGoogle(String url) {
	    driver.get(url);
	    System.out.println("Opened URL: " + driver.getTitle());
	}

	@Parameters("searchKey")
	@Test(priority = 2)
	public void searchInGoogle(String searchKey) {
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys(searchKey);
	    searchBox.sendKeys(Keys.ENTER);
	    System.out.println("Searched for: " + searchKey);
	}

	@AfterClass
	public void tearDown() {
	    if (driver != null) {
	        driver.quit();
	    }
	}


}
