package SeleniumProgramme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HiddenDivisionPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		driver.findElement(By.xpath("//a[@class='cd-popup-trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.close();

}
}