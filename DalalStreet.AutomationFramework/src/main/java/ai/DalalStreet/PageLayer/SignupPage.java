package ai.DalalStreet.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DalalStreet.TestBase.TestBase;

public class SignupPage extends TestBase {
	public SignupPage() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='Signup now']")
private WebElement link_Signup;

@FindBy(xpath="//input[@name='firstName']")
private WebElement txtbox_FirstName;

@FindBy(xpath="//input[@name='lastName']")
private WebElement  txtbox_LastName;

@FindBy(xpath="//input[@name='email']")
private WebElement txtbox_emailID;

@FindBy(xpath="//input[@name='password']")
private WebElement txtbox_Password;

@FindBy(xpath="//input[@name='agreement']")
private WebElement checkbox_agreement;

@FindBy(xpath="//div[@class='mt-3 d-grid']")
private WebElement button_GetyourjourneyStarted;


public void clickonlink()
{
	link_Signup.click();
}
public void enterFirstName(String FirstName)
{
	txtbox_FirstName.sendKeys(FirstName);
}
public void enterLastName(String LastName)
{
	txtbox_LastName.sendKeys(LastName);
}
public void enterEmailID(String EmailID)
{
	txtbox_emailID.sendKeys(EmailID);
}
public void enterPassword(String Password)
{
	txtbox_Password.sendKeys(Password);
}
public void clickonCheckbox()
{
	checkbox_agreement.click();
}
public void clickonGetyourjourneyStarted()
{
	button_GetyourjourneyStarted.click();
}
public String getactualurl()
{
	String act_url= driver.getCurrentUrl();
	return act_url;
}
}




