package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTestngSteps {
	static WebDriver driver;
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		Utility.setUpDriver();
		Utility.openPage("https://www.amazon.com");
	}

	@Then("^User search for the item$")
	public void user_search_for_the_item() throws Throwable {
		AmazonPageActions object = new AmazonPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.EnterItemName("Laptop");
		object.searchForItems();
		
		
	}

	@When("^User click the first item to check the price$")
	public void user_click_the_first_item_to_check_the_price() throws Throwable {
		AmazonPageActions object = new AmazonPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.selectFirstAppearedItem();
		object.printItemPrice();
	}

	@Then("^Display a successful message$")
	public void display_a_successful_message() throws Throwable {
		AmazonPageActions object = new AmazonPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.printSucessfulMessage();
		
	}
}