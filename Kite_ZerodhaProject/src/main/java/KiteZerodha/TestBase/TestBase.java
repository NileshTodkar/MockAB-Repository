package KiteZerodha.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import KiteZerodha.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	public static  LoginPage login;
	@Test
	public void setup() throws InterruptedException {
		
		String Br="Chrome";
		if(Br.equalsIgnoreCase("Chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		if(Br.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		if(Br.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//--------Login Functionality--------------
		//Thread.sleep(5000);
		System.out.println("driver="+driver);
		login=new LoginPage();
		login.enterUsername();
		login.enterPassword();
		login.clickOnLoginButton();
	

}
}
