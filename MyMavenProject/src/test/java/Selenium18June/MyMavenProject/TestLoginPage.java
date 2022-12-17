package Selenium18June.MyMavenProject;
import Selenium18June.MyMavenProject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestLoginPage {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.manage().deleteAllCookies(); 
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		
		LoginPage login=new LoginPage(driver);
		
		login.clickOnLoginButton1();
		Thread.sleep(1000);
		login.enterUsername();
		login.enterPassword();
		Thread.sleep(1000);
		login.clickOnLoginButton2();
		
		
	}

}
