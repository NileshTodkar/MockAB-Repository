package Selenium_Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
public class Relative_Xpath_TextType {
public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		RemoteWebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com//");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    Thread.sleep(3000);
		driver.get("https://www.redbus.in/");
	    driver.findElement(By.xpath("//a[text()='BUS TICKETS ']")).click();
	    Thread.sleep(3000);
	    driver.close();
}
}