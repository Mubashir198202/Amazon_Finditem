package amazon.us.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Hello, Sign in']")
	private WebElement acceptsignin;

	public WebElement getAcceptsignin() {
		return acceptsignin;
	}

	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement enterusername;

	public WebElement getEnterusername() {
		return enterusername;

	}

	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement enterpassword;

	public WebElement getEnterpassword() {
		return enterpassword;
	}
@FindBy(id ="twotabsearchtextbox")
	private WebElement enterIphone;

public WebElement getEnterIphone() {
	return enterIphone;
}

@FindBy(xpath ="//*[@class='a-price']")
 private WebElement phoneprice;

public WebElement getPhoneprice() {
	return phoneprice;
}


	
}
