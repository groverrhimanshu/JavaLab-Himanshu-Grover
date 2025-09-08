package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.SignUpPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUpSteps {
    SignUpPage signUpPage;

    @When("Sign up modal is open")
    public void sign_up_modal_is_open() throws InterruptedException {
        NavigationSteps.driver.findElement(By.id("signin2")).click();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.id("signInModal"));
        signUpPage = new SignUpPage(NavigationSteps.driver);
    }

    @When("I register with username {string} and password {string}")
    public void i_register_with_username_and_password(String username, String password) throws InterruptedException {
        signUpPage.enterUsername(username);
        Thread.sleep(700);
        signUpPage.enterPassword(password);
        Thread.sleep(700);
        signUpPage.clickSignUp();
        Thread.sleep(1000);
    }

    @Then("I should see an alert with message {string}")
    public void i_should_see_an_alert_with_message(String expectedMessage) throws InterruptedException {
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        assertTrue(alert.getText().contains(expectedMessage));
        alert.accept();
        Thread.sleep(2000);
    }
}
