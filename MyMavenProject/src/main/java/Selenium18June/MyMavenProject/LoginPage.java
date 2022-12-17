package Selenium18June.MyMavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginPage {
	
	private WebElement LoginButton1;
	private WebElement Username;
	private WebElement Passward;
	private WebElement LoginButton2;
	
	public LoginPage(WebDriver driver) {
		LoginButton1=driver.findElement(By.xpath("//a[@id='login2']"));
		Username=driver.findElement(By.xpath("//input[@id='loginusername']"));
		Passward=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		LoginButton2=driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		
	}

	public void clickOnLoginButton1() {
		LoginButton1.click();
		}
	
	public void enterUsername() {
		Username.sendKeys("Nilesh@123");
		}
	
	public void enterPassword() {
		 Passward.sendKeys("7057472724");
		}
	public void clickOnLoginButton2() {
		LoginButton2.click();
		}
	

}
