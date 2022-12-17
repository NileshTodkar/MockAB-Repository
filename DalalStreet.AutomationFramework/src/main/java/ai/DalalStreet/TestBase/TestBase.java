package ai.DalalStreet.TestBase;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import ai.DalalStreet.PageLayer.DashBoardPage;
import ai.DalalStreet.PageLayer.LoginPage;
import ai.DalalStreet.PageLayer.TransactionPage;
import ai.DalalStreet.PageLayer.TransactionPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static 	DashBoardPage dash;
	public static TransactionPage Trans;
	public static LoginPage login;
	public static TransactionPage1 Trans1;
	public static Logger logger;
	@BeforeClass
	public void start() {
		 logger=Logger.getLogger("Dalalstreet Automation Framework");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Framework Execution Started");
	}
	@AfterClass
	public void end() {
		logger.info("Framework Execution Completed");
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		String Br="Chrome";
		
		if(Br.equalsIgnoreCase("Chrome")) {
		   WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		if(Br.equalsIgnoreCase("Firefox")) {
			   WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		
		if(Br.equalsIgnoreCase("Edge")) {
			   WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		
		else {
			System.out.println("Please provide correct Browser");
		}
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		logger.info("Enter in to Application");
	// ------------ login Functionality---------------
	 dash=new DashBoardPage();
	 Trans =new TransactionPage();
	 Trans1 =new TransactionPage1 ();
		 login=new LoginPage();
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickonlogin1();
		Thread.sleep(3000);
		logger.info("Logged in Application");
		}
	
	@AfterMethod
	public void Browserclosed() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
