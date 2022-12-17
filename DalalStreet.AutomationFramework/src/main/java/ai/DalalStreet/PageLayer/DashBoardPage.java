package ai.DalalStreet.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DalalStreet.TestBase.TestBase;

public class DashBoardPage extends TestBase {
	
	public DashBoardPage() {
		
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement txtbox_Search;
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement Option;


public void enterComapanyName(String CompanyName) {
	
	txtbox_Search.sendKeys(CompanyName);
}
public void selectCompanyOption() {
	
	Option.click();
}
}