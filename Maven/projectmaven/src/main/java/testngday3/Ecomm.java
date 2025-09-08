package testngday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Ecomm {
	public class EcommerceTests
	{
		WebDriver driver;
		@BeforeClass
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("http://amazon.in");
			
		}
		@Test(groups= {"smoke"})
		public void testTitle()
		{
			System.out.println("Smoke Test-Title Check");
			System.out.println("Page Title:" +driver.getTitle());	
		}
		
		@Test(groups= {"regression"})
		public void testSearch()
		{
			System.out.println("Regression Test-Search");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
			driver.findElement(By.id("nav-search-submit-button")).click();
		}
		
		@Test(groups= {"sanity", "regression"})
		public void testCart()
		{
			System.out.println("Sanity + Regression- Cart Test");
		}

		@AfterClass
		public void teardown()
		{
			driver.quit();
		}


}}
