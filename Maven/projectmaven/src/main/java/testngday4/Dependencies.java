package testngday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Dependencies {
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void HealthSetup()
	{
		driver.get("https://o2.openmrs.org/openmrs/login.htm");	
	}
	
	@Test(dependsOnMethods= {"HealthSetup"})
	public void Login()
	{
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(dependsOnMethods= {"HealthSetup", "Login"})
	public void patientRegister() throws InterruptedException {
	    driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
	    Thread.sleep(3000);

	    driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")).sendKeys("Himanshu");
	    driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")).sendKeys("Grover");
	    driver.findElement(By.id("next-button")).click();

	    driver.findElement(By.xpath("//option[@value='M']")).click();
	    driver.findElement(By.id("next-button")).click();

	    driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys("01");
	    driver.findElement(By.xpath("//select[@id='birthdateMonth-field']")).sendKeys("January");
	    driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2001");

	    driver.findElement(By.id("next-button")).click();
	    driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input")).click();
	    driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input")).click();
	    driver.findElement(By.id("cityVillage")).sendKeys("Noida");
	    driver.findElement(By.id("stateProvince")).sendKeys("UP");
	    driver.findElement(By.id("country")).sendKeys("India");
	    driver.findElement(By.id("postalCode")).sendKeys("201303");
	    driver.findElement(By.id("next-button")).click();
	    
	    driver.findElement(By.id("Registration Desk")).click();
	}


}
