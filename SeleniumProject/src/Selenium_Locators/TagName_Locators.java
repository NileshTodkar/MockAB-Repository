package Selenium_Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TagName_Locators {
public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com//");
		driver.findElement(By.tagName("button")).click();
	
}
}
