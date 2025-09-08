package projectmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Himanshu");
		driver.findElement(By.id("lastName")).sendKeys("Grover");
		driver.findElement(By.id("userEmail")).sendKeys("groverhimanshu2001@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7428253269");
		//driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")).click();
		
		//driver.findElement(By.id("dateOfBirthInput")).clear();
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("20 Aug 2001");
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("English");
		subject.sendKeys(Keys.DOWN , Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Himanshu Grover\\Downloads\\PHOTO (1).jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Noida sector-1");
		Thread.sleep(1000);

		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.DOWN , Keys.ENTER);
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Noida");
		city.sendKeys(Keys.DOWN , Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		
		
		

	}

}
