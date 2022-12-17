package ai.DalalStreet.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DalalStreet.TestBase.TestBase;

public class TransactionPage extends TestBase {
	
	public TransactionPage() {
		
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement button_Buy1;
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement txtbox_quantiy;
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement button_Buy2;
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement Status;
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement Transaction;

	public void clickonBuy1() {
		button_Buy1.click();
}
	public void enterShareQuantity(String ShareQuantity) {
		txtbox_quantiy.click();
		txtbox_quantiy.sendKeys(ShareQuantity);
}
	public void clickonBuy2() {
		button_Buy2.click();
}
	public String getStatus() {
		String ActualStatus=Status.getText();
		return ActualStatus;
}
	public void getTrasactionPage() {
		 Transaction.click();
	}
}
