package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ProductsPage;

public class ProductsPageSteps {
	ProductsPage productsPage = new ProductsPage();
	private final TestContext testContext = TestContext.getInstance();
	
	@Then("I check if I picked correct product")
	public void iCheckIfIPickedCorrectProduct () {
		Assert.assertEquals(productsPage.getProductName(), testContext.getCapturedLaptopName(), "Product mismatch");
	}
}
