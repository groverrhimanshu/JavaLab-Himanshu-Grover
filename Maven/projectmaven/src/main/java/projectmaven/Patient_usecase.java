package projectmaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_usecase {

	public static void main(String[] args) throws IOException,InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		Thread.sleep(2000);

		WebElement facility = driver.findElement(By.xpath("/html/body/section/div/div/form/div[1]/div/select"));
		facility.sendKeys("Tokyo CURA Healthcare Center");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/form/div[2]/div/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/form/div[3]/div/label[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/form/div[4]/div/input")).sendKeys("10/09/2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/form/div[5]/div/textarea")).sendKeys("NA");
		Thread.sleep(2000);
		driver.findElement(By.id("btn-book-appointment")).click();
		Thread.sleep(2000);

		String confirmation = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Appointment Confirmation: " + confirmation);

	}

}
