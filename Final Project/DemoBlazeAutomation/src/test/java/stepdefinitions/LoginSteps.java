package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    LoginPage loginPage;

    @When("Log in modal is open")
    public void log_in_modal_is_open() throws InterruptedException {
        NavigationSteps.driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.id("logInModal"));
        loginPage = new LoginPage(NavigationSteps.driver);
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) throws InterruptedException {
        loginPage.enterUsername(username);
        Thread.sleep(700);
        loginPage.enterPassword(password);
        Thread.sleep(700);
        loginPage.clickLogin();
        Thread.sleep(1000);
        //Thread.sleep(3000);
    }
    
    @Then("I should see a welcome message with username {string}")
    public void i_should_see_a_welcome_message_with_username(String username) {
        NavigationSteps.waitUtil.waitForElementVisible(By.id("nameofuser"));
        String navbarText = NavigationSteps.driver.findElement(By.id("nameofuser")).getText();
        String expectedText = "Welcome " + username;
        assertTrue(navbarText.equals(expectedText), "Expected: " + expectedText + " but was: " + navbarText);
    }
    
    @Then("I should see a welcome alert with message {string}")
    public void i_should_see_a_welcome_alert_with_message(String expectedMessage) throws InterruptedException {
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        assertTrue(alert.getText().contains(expectedMessage));
        alert.accept();
        Thread.sleep(2000);
        // Optionally, quit after invalid login to reset browser state
        // NavigationSteps.driver.quit();
    }
    
    @Then("I should see a alert with message {string}")
    public void i_should_see_a_welcome_alert_message(String expectedMessage) throws InterruptedException {
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        assertTrue(alert.getText().contains(expectedMessage));
        alert.accept();
        Thread.sleep(2000);
    }   
    @Then("I should see a login alert with message {string}")
    public void i_should_see_welcome_alert_message(String expectedMessage) throws InterruptedException {
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        assertTrue(alert.getText().contains(expectedMessage));
        alert.accept();
        Thread.sleep(2000);
    }
    
}
