package SeleniumProgramme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUp {
	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_Cj0KCQiAyMKbBhD1ARIsANs7rEGEsqB4vZ46z9NWyQK1cSybQJmzQTIygKuNJdwmtpa7w90h3hEaCMUaAhMSEALw_wcB_k_&gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEGEsqB4vZ46z9NWyQK1cSybQJmzQTIygKuNJdwmtpa7w90h3hEaCMUaAhMSEALw_wcB");
		Actions a= new Actions(driver);
		WebElement r=driver.findElement(By.xpath("//img[@alt='Cleaning accessories']"));
		a.contextClick(r).perform();
		
		WebElement c=driver.findElement(By.xpath("//img[@alt='Refrigerators']"));
		a.doubleClick(c).perform();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
