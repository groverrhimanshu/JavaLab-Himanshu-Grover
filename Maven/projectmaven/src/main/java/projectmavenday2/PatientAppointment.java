package projectmavenday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientAppointment {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.fortishealthcare.com");

        WebElement location = driver.findElement(By.id("locations"));
        Select select = new Select(location);

        select.selectByVisibleText("Noida");
        driver.findElement(By.xpath("//*[@id=\"block-fortisbottomnavigationblock\"]/nav/div/ul/li[2]/a/img")).click();
        Thread.sleep(3000); 

        driver.findElement(By.xpath("//*[@id=\"block-fortis-content\"]/div/div/div/ul/li[1]/div[2]/a[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[2]/div[1]/div/button[2]")).click();

        Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[2]/div[2]/div/div/div/div[2]")).click();       
         Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\'slot-booking\']/div/div[4]")).click();

         driver.findElement(By.className("mobile-number-input-container")).sendKeys("");

         driver.findElement(By.className("get-otp-btn")).click();      
        WebElement firstName = driver.findElement(By.id("edit-firstname--ln6OnLIEQdE"));

        firstName.clear();
        firstName.sendKeys("H");
        WebElement lastName = driver.findElement(By.id("edit-lastname--l-0NyEfl71A"));
        lastName.clear();
        lastName.sendKeys("G");
        WebElement mobile = driver.findElement(By.id("edit-phonenumber--r1yLxvGMNYw"));
        mobile.clear();
        mobile.sendKeys("1234567890");
        WebElement email = driver.findElement(By.id("edit-emailid--3ycNd_5IjuE"));
        email.clear();
        email.sendKeys("");
        Select hospitalDropdown = new Select(driver.findElement(By.id("edit-hospitalcode--PRuj7NtwyJk")));
        hospitalDropdown.selectByVisibleText("Fortis Hospital, Kolkata");

        WebElement comment = driver.findElement(By.id("edit-comment--R_CcETe5qz4"));

        comment.clear();

        comment.sendKeys("This is a test automation booking");      
        driver.findElement(By.id("edit-request-callback-popup-submit--DYCMLvXh1oc")).click();

        Thread.sleep(5000);       
        driver.quit();


	}

}
