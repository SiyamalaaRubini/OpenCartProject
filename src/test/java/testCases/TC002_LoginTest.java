package testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"Regression","Master"})
	public void Verify_login() {
		
		
		
		try {
		logger.info("****!!! Starting TC002_LoginTest !!!****");
		HomePage hp=new HomePage(driver);
		hp.MyAcountclick();
		hp.Loginoptionclick();
		
		LoginPage lp=new LoginPage(driver);
		lp.Enter_email(p.getProperty("email"));
		lp.Enter_pwd(p.getProperty("password"));
		//lp.Enter_pwd(p.getProperty("wrong_password"));
		lp.click_login();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpage=mp.isMyAccountPageexists();
		
		Assert.assertTrue(targetpage);//Assert.assertEquals(targetpage, true,"Login fails");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
		
		logger.info("****!!! Finished TC002_LoginTest !!!****");
		
	}

}
