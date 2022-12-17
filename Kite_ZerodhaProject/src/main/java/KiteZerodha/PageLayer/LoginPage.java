package KiteZerodha.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import KiteZerodha.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=" //input[@id='userid']")
	private WebElement txtbox_Username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtbox_Password;
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement button_Login;
	
public void enterUsername() {
	txtbox_Username.sendKeys("CZ0486");
	
}
public void enterPassword() {
	txtbox_Password.sendKeys("Nileshrutu@23");
	
}
public void clickOnLoginButton() {
	button_Login.click();
	
}
}
