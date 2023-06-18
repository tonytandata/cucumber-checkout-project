package step_definitions;

import implementation.Checkout;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CheckoutSteps {
    Checkout checkout;
    int bananaPrice = 0;
    @Given("the price of a {string} is {int}c")
    public void thePriceOfAIsC(String name, Integer price) throws Throwable {
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(Integer itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBe40c(Integer total) throws Throwable {
        Assert.assertEquals(total, checkout.total());
    }
}
