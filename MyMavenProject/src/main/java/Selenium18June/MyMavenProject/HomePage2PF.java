package Selenium18June.MyMavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage2PF {

	HomePage2PF(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//a[@id='itemc'])[1]")
	private WebElement Phones;
	@FindBy(xpath="(//a[@id='itemc'])[2]")
	private WebElement Laptops;
	@FindBy(xpath="(//a[@id='itemc'])[3]")
	private WebElement Monitors;
	
	public void clickOnLaptops() throws InterruptedException {
		
		Laptops.click();
		Thread.sleep(2000);
		}
	public void clickOnMonitors() throws InterruptedException {
		
		Monitors.click();
		Thread.sleep(2000);
	}
	public void clickOnPhones() throws InterruptedException {
		
		Phones.click();
		Thread.sleep(2000);
	}

}
