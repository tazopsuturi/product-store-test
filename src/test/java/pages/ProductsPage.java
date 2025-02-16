package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ProductsPage extends Form {
	private final IButton placeOrderButton = getElementFactory()
			.getButton(By.xpath("//button[@class='btn btn-success']"), "Place order");
	private final ILabel productName = getElementFactory()
			.getLabel(By.xpath("//tr[@class='success']/td[2]"), "Product Name");
	
	public ProductsPage () {
		super(By.xpath("//button[@class='btn btn-success']"), "Products");
	}
	
	public String getProductName () {
		return productName.getText();
	}
}
