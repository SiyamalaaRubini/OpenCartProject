package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registeroption;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginOption;
	
	
	//Action Methods
	
	public void MyAcountclick() {
		myaccount.click();
	}
	
	public void Registeroptionclick() {
		registeroption.click();
	}
	
	public void Loginoptionclick() {
		loginOption.click();
	}
	
}
