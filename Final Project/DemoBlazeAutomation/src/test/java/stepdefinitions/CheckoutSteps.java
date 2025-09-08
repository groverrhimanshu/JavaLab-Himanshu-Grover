package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import pages.CheckoutPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutSteps {
    
    CheckoutPage checkoutPage;
    

    @When("I proceed to Place Order")
    public void i_proceed_to_place_order() throws InterruptedException {
        checkoutPage = new CheckoutPage(NavigationSteps.driver);
        checkoutPage.clickPlaceOrderButton();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.id("orderModal"));
        Thread.sleep(1000);
    }

    @When("I provide details {string} {string} {string} {string} {string} {string}")
    public void i_provide_details(String name, String country, String city, String card, String month, String year) throws InterruptedException {
        checkoutPage.fillCheckoutForm(name, country, city, card, month, year);
        Thread.sleep(1500);
    }

    @When("I complete purchase")
    public void i_complete_purchase() throws InterruptedException {
        checkoutPage.clickPurchase();
        Thread.sleep(1000);
    }

    @Then("I should see success message {string}")
    public void i_should_see_success_message(String expectedMessage) throws InterruptedException {
    	Thread.sleep(1200);
        String actualMessage = checkoutPage.getConfirmationMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
