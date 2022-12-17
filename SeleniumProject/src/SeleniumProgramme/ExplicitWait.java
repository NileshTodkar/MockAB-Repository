package SeleniumProgramme;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
	WebDriver driver = new ChromeDriver(); // upcasting
	driver.manage().window().maximize();   //maximize the chrome browser window
	driver.manage().deleteAllCookies();   // delete all privious coockies;
	driver.get("https://demoqa.com/alerts");
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	
	Thread.sleep(2000);    // Unconditonal Synchronization /Unconditonal Wait/hard wait
	driver.switchTo().alert().accept();
	
	//Explicit Wait 
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	

	}

}
