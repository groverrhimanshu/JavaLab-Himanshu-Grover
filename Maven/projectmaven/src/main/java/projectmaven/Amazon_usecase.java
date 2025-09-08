package projectmaven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_usecase {

	public static void main(String[] args) throws IOException,InterruptedException{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        props.load(fis);

        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();

	      
        WebElement emailField = driver.findElement(By.id("ap_email_login"));
        emailField.sendKeys(email);
        driver.findElement(By.id("continue")).click();

       
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        
        
        Thread.sleep(30000);
       
         
         List<String> products = new ArrayList<>();
         products.add("laptop");
         products.add("camera");
         products.add("Speaker");
         for (String product : products) {
             
             WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
             searchBox.clear();
             searchBox.sendKeys(product);
             driver.findElement(By.id("nav-search-submit-button")).click();
             driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
             Thread.sleep(3000);
         }
             
             driver.findElement(By.xpath("//a[@href='/cart?ref_=ox_ewc_ret_gtc_dsk_in']")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//input[@id='pp-f0bRlF-152']")).click();

  
  
    }

		
	

}
