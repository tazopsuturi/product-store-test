package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps {
	MainPage mainPage = new MainPage();
	private final TestContext testContext = TestContext.getInstance();
	
	@When("I choose laptop category")
	public void iChooseLaptopCategory () {
		mainPage.selectLaptopCategory();
	}
	
	@When("I get the name of product")
	public void iGetTheNameOfProduct () {
		testContext.setCapturedLaptopName(mainPage.getFirstLaptopName());
	}
	
	@When("I choose laptop")
	public void iChooseLaptop () {
		mainPage.openFirstLaptopDetails();
	}
}
