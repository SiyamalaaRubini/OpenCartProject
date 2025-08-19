package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pageObject.HomePage;
import pageObject.RegisterPage;

public class TC001_AccountRegisteration extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void VerifyRegisteration() throws InterruptedException {
		
		try {
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		
		logger.info("***** Starting TC001_AccountRegisteration *****");
		
		
		logger.info("***** Clicking on My Account *****");
		hp.MyAcountclick();
		
		logger.info("***** Clicking on Registeration *****");
		hp.Registeroptionclick();
		
		RegisterPage rp=new RegisterPage(driver);
		
		logger.info("***** Entering details *****");
		rp.enterfirstname(randomString().toUpperCase());
		rp.enterlastname(randomString().toUpperCase());
		rp.enteremail(randomString()+"@yahoo.com");
		rp.entertelephone(randomNumber());
		
		String password= randomAlphaNumeric();
		rp.enterpassword(password);
		rp.enterpasswordConfirm(password);
		
		rp.yesRadio();
		rp.clickagreeCheckbox();
		logger.info("***** Clicking on Continue button *****");
		rp.clickcontinueButton();
		
		Thread.sleep(2000);
		String Confirmation_message=rp.successmsgCheck();
		logger.info("***** Verifying Success Message *****");
		
		if(Confirmation_message.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error(" Error logs ....");
			logger.debug("Debug logs ....");
			Assert.assertTrue(false);
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
		
		
		logger.info("***** Finished TC001_AccountRegisteration *****");
		
		
	}
	
	
	
	
}
