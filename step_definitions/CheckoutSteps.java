package step_definitions;

import implementation.Checkout;
import io.cucumber.java.en.*;
import io.cucumber.java.PendingException;

public class CheckoutSteps {
    int bananaPrice = 0;
    @Given("the price of a {string} is {int}c")
    public void thePriceOfAIsC(String name, Integer price) throws Throwable {
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(Integer itemCount, String itemName) throws Throwable {
        Checkout checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("the total price should be 40c")
    public void theTotalPriceShouldBe40c() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
