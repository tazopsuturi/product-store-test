package stepdefinitions;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestContext {
	private static TestContext instance; // Singleton instance
	private String capturedLaptopName;
	
	// Private constructor to prevent direct instantiation
	TestContext () {
	}
	
	// Get singleton instance
	public static TestContext getInstance () {
		if (instance == null) {
			instance = new TestContext();
		}
		return instance;
	}
}
