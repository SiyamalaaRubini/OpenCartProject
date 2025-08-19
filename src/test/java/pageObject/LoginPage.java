package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement eml;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement Login_button;
	
	//Action methods
	
	public void Enter_email(String email) {
		eml.sendKeys(email);
	}
	
	public void Enter_pwd(String password) {
		pwd.sendKeys(password);
	}
	
	public void click_login() {
		Login_button.click();
	}
	
	
	
}
