package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageActions extends AmazonElementsLocator {

	public AmazonPageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterItemName(String item) {
		searchBar.sendKeys(item);
	}
	
	public void searchForItems() {
		sendButton.click();
	}
	
	public void selectFirstAppearedItem() {
		firstResult.click();
	}
	
	public void printItemPrice() {
		System.out.println("The price of this item is " + firstResultItemPrice.getText());
	}
	
	public void printSucessfulMessage() {
		System.out.println("SUCCESSFUL FUNCTIONALITY TEST");
	}
	
}
