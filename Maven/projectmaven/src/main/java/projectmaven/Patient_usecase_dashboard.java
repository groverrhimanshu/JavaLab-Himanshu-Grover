package projectmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_usecase_dashboard {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);
      
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");     
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword"); 

        Thread.sleep(2000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);

        
        WebElement dashboard = driver.findElement(By.xpath("//h2"));
        if (dashboard.getText().contains("Make Appointment")) {
            System.out.println("Login successful. Patient dashboard displayed.");
        } else {
            System.out.println("Login failed or dashboard not loaded.");
        }
        Thread.sleep(2000);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("InvalidUser");    
        driver.findElement(By.id("txt-password")).sendKeys("WrongPassword");  
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);

        
        WebElement errorMsg = driver.findElement(By.xpath("//p[@class='lead text-danger']"));
        if (errorMsg.isDisplayed()) {
            System.out.println("Error message on invalid credentials: " + errorMsg.getText());
        } else {
            System.out.println("No error message displayed for invalid credentials!");
        }
        Thread.sleep(2000);
        driver.quit();
	}

}
