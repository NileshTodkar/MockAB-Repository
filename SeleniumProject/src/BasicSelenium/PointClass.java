package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
public class PointClass {
	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.manage().deleteAllCookies();
		Point p=new Point (500,700);
		driver.manage().window().setPosition(p);
		
}
}