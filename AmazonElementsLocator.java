package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonElementsLocator {
	WebDriver driver;
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	public WebElement searchBar;
	
	@FindBy(how=How.XPATH,using="//input[@value='Go']")
	public WebElement sendButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='result_0']//h2")
	public WebElement firstResult;
	
	@FindBy(how=How.ID,using="priceblock_ourprice")
	public WebElement firstResultItemPrice;
	
	
	public AmazonElementsLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
