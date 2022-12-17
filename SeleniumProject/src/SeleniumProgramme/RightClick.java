package SeleniumProgramme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class RightClick {
public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com/login/");
		WebElement a= driver.findElement(By.xpath("//button[@ name='login']"));
        //a.click();
        Actions r= new Actions(driver);
        r.doubleClick(a).perform();
        r.contextClick(a).perform();
}
}