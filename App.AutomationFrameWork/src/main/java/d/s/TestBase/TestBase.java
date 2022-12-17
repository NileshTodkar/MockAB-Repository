package d.s.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	@BeforeMethod
	public void setup() {
		String br="Chrome";
		if(br.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			}
		else if(br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			}
		driver.get("https://apps.dalalstreet.ai/dashboard");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
    @AfterMethod
    public void end() {
    	driver.quit();
    }
}
