package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddToCardPage;

public class AddToCardPageSteps {
	AddToCardPage addToCardPage = new AddToCardPage();
	
	@Then("Adding to card page opens")
	public void addingToCardPageOpens () {
		Assert.assertTrue(addToCardPage.state().waitForDisplayed(), "Adding to card page did not open");
	}
	
	@When("I click Add to card")
	public void iClickAddToCard () {
		addToCardPage.clickAddTocard();
	}
	
	@When("I accept the alert")
	public void iAcceptTheAlert () {
		addToCardPage.acceptAlert();
	}
	
	@When("I press cart button")
	public void iPressCartButton () {
		addToCardPage.pressCartButton();
	}
}

