package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_00_1_CreateAccount extends BaseClass {
	
	
	
	@Test(groups={"Regression","Master"})
	public void acntVerify()
	{
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link.. ");
		hp.clickRegister();
		logger.info("Clicked on Register Link.. ");
		logger.info("Providing customer details...");
		RegisterPage rp=new RegisterPage(driver);
		rp.setfname(randomNo().toUpperCase());
		rp.setlname(randomNo().toUpperCase());
		rp.setemail(randomStr() +"@gmail.com");
		rp.settel(randomNo());
		String passwd=randomeAlphaNumberic();
		rp.setpwd(passwd);
		rp.setcnfpwd(passwd);
		rp.clickContinue();
		
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		
		
	}
	
}



