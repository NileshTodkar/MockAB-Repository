package SeleniumProgramme;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args []) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://dubai360.com/scene/375-above-atlantis-the-palm-hotel-palm-jumeirah/en");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[11]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[6]/img")).click();
		driver.switchTo().alert().dismiss();
	
		
	}

}
