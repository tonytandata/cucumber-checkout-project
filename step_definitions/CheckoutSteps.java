package step_definitions;

import implementation.Catalog;
import implementation.Checkout;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CheckoutSteps {
    Checkout checkout = new Checkout();
    Catalog catalog = new Catalog();
    @Given("the price of a {string} is {int}c")
    public void thePriceOfAIsC(String name, int price) {
        catalog.add(name, price);
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int itemCount, String itemName) {
        int itemPrice = catalog.getPrice(itemName);
        checkout.add(itemCount, itemPrice);
    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBe40c(int total) {
        Assert.assertEquals(total, checkout.total());
    }
}
