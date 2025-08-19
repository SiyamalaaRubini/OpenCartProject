package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage{

	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement passwordConfirm;
	
	@FindBy(xpath="//div[@class='col-sm-10']//input[@name='newsletter' and @value='1']")
	WebElement yesRadiobutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement agreeCheckbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement successmsg;
	
	//ActionMethods
	
	public void enterfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void enterlastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	
	public void enteremail(String eml) {
		email.sendKeys(eml);
	}
	
	
	public void entertelephone(String tphone) {
		telephone.sendKeys(tphone);
	}
	
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	
	public void enterpasswordConfirm(String pwd) {
		passwordConfirm.sendKeys(pwd);
	}
	
	public void yesRadio() {
		yesRadiobutton.click();
	}
	
	public void clickagreeCheckbox() {
		agreeCheckbox.click();
	}
	
	public void clickcontinueButton() {
		continuebutton.click();
	}
	
	public String successmsgCheck() {
		try {
			return successmsg.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	
}
