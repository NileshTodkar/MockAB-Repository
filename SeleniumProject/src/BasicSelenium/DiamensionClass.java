package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
public class DiamensionClass {
	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().deleteAllCookies();
		Dimension d=new Dimension(500,700); 
		driver.manage().window().setSize(d);
		driver.manage().window().maximize(); 
		driver.manage().window().getSize();
		System.out.println(d.width);
		System.out.println(d.height);
		driver.get("https://www.redbus.in/");
	    Thread.sleep(3000);
		driver.close();
	}

}
