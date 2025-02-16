package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {
	
	@Before
	public void setUp () {
		getBrowser().maximize();
		getBrowser().goTo(SettingsTestData.getEnvData().getHost());
	}
	
	@After
	public void tearDown () {
		if (AqualityServices.isBrowserStarted()) {
			getBrowser().quit();
		}
	}
}





