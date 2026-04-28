package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver)
	{	
	super(driver);
	}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement fname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement lname;

@FindBy(xpath="//input[@id='input-email']")
WebElement email;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement tphone;

@FindBy(xpath="//input[@id='input-password']")
WebElement pwd;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement cnfpwd;

@FindBy(xpath="//input[@name='agree']")
WebElement agreechk;

@FindBy(xpath="//input[@value='Continue']")
WebElement conbuttn;


public void setfname(String firstname)
{
	fname.sendKeys(firstname);
	
}
public void setlname(String lastname)
{
	lname.sendKeys(lastname);
	
}

public void setemail(String Emailid)
{
	email.sendKeys(Emailid);
	
}public void settel(String Telephone)
{
	tphone.sendKeys(Telephone);
	
}public void setpwd(String Password)
{
	pwd.sendKeys(Password);
	
}public void setcnfpwd(String confirmpwd)
{
	cnfpwd.sendKeys(confirmpwd);
	
}public void aggree()
{
	agreechk.click();
}
public void clickContinue() {
	conbuttn.click();
}

}
