package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ImpementationOfGenerelization implements GenerelizationInterface {
	
	static WebDriver d;
		public void chrome() {
			System.setProperty("k1","v1");
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get("https://www.facebook.com/login/");
			}
	   public void fireFox() {
			System.setProperty("k2","v2");
			d=new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get("https://www.redbus.in/");
			
		}
		
		
		
		
	}
	


