package projectmavenday2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Insta_login {
	WebDriver driver;	 
    @BeforeClass
    public void setup() throws IOException {       
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();       
    }
    @BeforeMethod
    public void InstaSite() {
    	driver.get("https://www.instagram.com/"); 	
    }
    @Test(priority=0)
    public void Login() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("collect_232001");
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("collect_23");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	Thread.sleep(9000);
    	
    }
    @Test(priority=1)
    public void post() throws InterruptedException {
    	WebElement createBtn = driver.findElement(By.xpath("//span[text()='Create']"));
    	createBtn.click();
    	
    	WebElement postBtn = driver.findElement(By.xpath("//span[text()='Post']"));
    	postBtn.click();
    	WebElement selectComputer = driver.findElement(By.xpath("//button[text()='Select from computer']"));
    	selectComputer.click();
    	Thread.sleep(4000);
    	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
    	fileInput.sendKeys("\"C:\\Users\\Himanshu Grover\\Downloads\\PHOTO (2).jpg\"");

    	
    	Thread.sleep(3000); 
    

    	
    }
    
}
