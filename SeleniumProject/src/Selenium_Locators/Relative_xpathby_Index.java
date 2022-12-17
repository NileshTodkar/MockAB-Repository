package Selenium_Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
public class Relative_xpathby_Index {
	
public static void main(String args []) throws ElementNotInteractableException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com//");
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		  driver.findElement(By.xpath("(//div[@class='_6lux'])[2]")).sendKeys("123456");
		  //  driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
	
}
}
