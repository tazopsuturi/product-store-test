package pages;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.SettingsTestData;

import java.time.Duration;

public class AddToCardPage extends Form {
	private final int MAX_WAIT = SettingsTestData.getEnvData().getWait();
	private final IButton addToCard = getElementFactory()
			.getButton(By.xpath("//a[@class='btn btn-success btn-lg']"), "Add to card");
	private final IButton cartButton = getElementFactory()
			.getButton(By.id("cartur"), "cart", ElementState.EXISTS_IN_ANY_STATE);  // Corrected By.id usage
	
	public AddToCardPage () {
		super(By.xpath("//a[@class='btn btn-success btn-lg']"), "Add to card");
	}
	
	public void clickAddTocard () {
		addToCard.click();
	}
	
	public void acceptAlert () {
		AqualityServices.getConditionalWait().waitFor(() -> {
			try {
				AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
				return true;
			} catch (Exception e) {
				return false;
			}
		}, Duration.ofSeconds(MAX_WAIT));
		
		waitForPageToStabilize();
	}
	
	private void waitForPageToStabilize () {
		AqualityServices.getConditionalWait().waitFor(() -> cartButton.state().waitForDisplayed(), Duration.ofSeconds(MAX_WAIT));
	}
	
	public void pressCartButton () {
		boolean isButtonReady = AqualityServices.getConditionalWait().waitFor(() -> cartButton.state().waitForDisplayed() && cartButton.state().isEnabled(), Duration.ofSeconds(MAX_WAIT));
		if (isButtonReady) {
			cartButton.click();
		} else {
			System.out.println("Cart button is not ready for interaction.");
		}
	}
}
