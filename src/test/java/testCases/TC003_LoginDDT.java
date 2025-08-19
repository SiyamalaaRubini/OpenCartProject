package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import utilities.DataProviders;


/*
Data(email&pwd) is Valid -> login success - test pass - logout
				 			login unsuccess- test fail


Data(email&pwd) is Invalid -> login success - test fail -logout
					   		  login unsuccess - test pass

*/

@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups="datadriven")
public class TC003_LoginDDT extends BaseClass {
	
public void Verify_loginDDT(String email, String pwd, String exp_result) {
		
		logger.info("****!!! Starting TC003_LoginDDT !!!****");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.MyAcountclick();
		hp.Loginoptionclick();
		
		LoginPage lp=new LoginPage(driver);
		lp.Enter_email(email);
		lp.Enter_pwd(pwd);
		lp.click_login();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpage=mp.isMyAccountPageexists();
		
		/*
				Data(email&pwd) is Valid -> login success - test pass - logout
								 			login unsuccess- test fail
			 
			 
			  	Data(email&pwd) is Invalid -> login success - test fail -logout
			  					   			  login unsuccess - test pass
		 
		 */
			
		if(exp_result.equalsIgnoreCase("valid")) {
			if(targetpage) {
				mp.Clicklogout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp_result.equalsIgnoreCase("invalid")) {
			if(targetpage) {
				mp.Clicklogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("****!!! Finished TC003_LoginDDT !!!****");
}

}
