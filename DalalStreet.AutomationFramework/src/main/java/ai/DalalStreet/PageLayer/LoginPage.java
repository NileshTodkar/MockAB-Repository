package ai.DalalStreet.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DalalStreet.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage () {
		PageFactory.initElements( driver,this);
	}
//--------------Object Creation---------------------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement txtbox_email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtbox_Password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement button_Login;
	
	//--------------Action Methods---------------------------	
	
	public void enterEmailID(String EmailID)  {
	
		txtbox_email.sendKeys(EmailID);
	}
	public void enterPassword(String Password) {
		txtbox_Password.sendKeys(Password);
	}
	
	public void clickonlogin1() {
		button_Login.click();
	}
	public String geturl() {
		
		String C_url=driver.getCurrentUrl();
		return C_url;
	}
	
}
