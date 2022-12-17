package SeleniumProgramme;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
public static void main(String args []) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
	WebDriver driver = new ChromeDriver(); // upcasting
	//driver.manage().window().maximize();   //maximize the chrome browser window
	driver.manage().deleteAllCookies();   // delete all privious coockies;
	driver.get("file:///E:/Velocity%20Software%20Testing%20Cource/Rajgad%20Fort.html");
	Thread.sleep(3000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll(0,800)");
	Thread.sleep(3000);
	js.executeScript("scroll(0,-800)");
	Thread.sleep(3000);
	js.executeScript("scroll(500,0)");
	Thread.sleep(3000);
	js.executeScript("scroll(-500,0)");
	Thread.sleep(3000);
	driver.close();
	
}
}
