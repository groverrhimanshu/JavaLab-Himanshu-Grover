package projectmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_Login {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nivaancare.com/next/request-appointment?utm_source=google&utm_medium=paidsearch&utm_source_platform=search&utm_campaign=BI_South_Delhi_ALL_Leads_May2025&utm_term=Nivaan&utm_content=nivaan%20care&keyword=nivaan%20care&matchtype=p&network=g&device=c&campaign_id=22486703177&adgroup_id=177759503206&ad_id=750372535562&gad_source=1&gad_campaignid=22486703177&gbraid=0AAAAApM9JvfcOTKL4hcEAewL3dFQwJX36&gclid=Cj0KCQjwnovFBhDnARIsAO4V7mBrbXtTuwm1SKLoBq0yzuFIth8oDZDn6ALcHWrNxIJDFELuuJuYK74aAp-PEALw_wcB");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[1]/div/div[1]/div/input")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[1]/div/div[2]/div/input")).sendKeys("Grover");
		driver.findElement(By.xpath("//*[@id=\"international_PhoneNumber_countrycode\"]")).sendKeys("7428253269");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[2]/div/div[2]/select"));
		Select select = new Select(drop);
		select.selectByIndex(3);
		
		WebElement checkbox = driver.findElement(By.id("Checkbox_1"));
		checkbox.click();
		
		WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[2]/div/div[2]/select"));
		Select select1 = new Select(drop1);
		select1.selectByIndex(3);
		
		
		
		
	}

}
