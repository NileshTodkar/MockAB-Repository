package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public interface GenerelizationInterface {
	
	static String k1="webdriver.chrome.driver";
	static String k2="webdriver.gecko.driver";
	
	static String v1="C:\\Java\\chromedriver.exe";
	static String v2="C:\\Java\\geckodriver.exe";
	
    public void chrome();
    public void fireFox();
}
