package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import aquality.selenium.elements.interfaces.IButton;
import org.openqa.selenium.By;
import utils.SettingsTestData;

import java.time.Duration;

public class MainPage extends Form {
	private final IButton btnChooseLaptopCategory = getElementFactory()
			.getButton(By.xpath("//a[@onclick=\"byCat('notebook')\"]"), "Laptop Category Button");
	private final ILabel lblFirstLaptopName = getElementFactory()
			.getLabel(By.xpath("//div[@id='tbodyid']/div[1]//h4/a"), "First Laptop Name", ElementState.EXISTS_IN_ANY_STATE);
	
	public MainPage () {
		super(By.xpath("//img[@src='bm.png']"), "Main Page Logo");
	}
	
	public void selectLaptopCategory () {
		btnChooseLaptopCategory.click();
		waitForLaptopsToLoad();
	}
	
	private void waitForLaptopsToLoad () {
		lblFirstLaptopName.state().waitForDisplayed(Duration.ofSeconds(SettingsTestData.getEnvData().getWait()));
	}
	
	public String getFirstLaptopName () {
		return lblFirstLaptopName.getText();
	}
	
	public void openFirstLaptopDetails () {
		lblFirstLaptopName.click();
	}
}
