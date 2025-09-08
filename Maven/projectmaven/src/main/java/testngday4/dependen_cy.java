package testngday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class dependen_cy {
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(groups= {"healthsetup"})
	public void HealthSetup()
	{
		driver.get("https://o2.openmrs.org/openmrs/login.htm");	
	}	
	@Test(groups= {"login"})
	public void Login()
	{
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	

}
