package SeleniumProgramme;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://phptravels.com/");
		String parent=driver.getWindowHandle();
		WebElement a=driver.findElement(By.xpath("(//a[@data-name='signup'])[2]"));
		a.click();
		Set<String> e=driver.getWindowHandles();
		int count=e.size();
		System.out.println("Count of Windows : "+count);
		Thread.sleep(3000);
		for(String child:e) {
			if(parent.equalsIgnoreCase(child)) {
				System.out.println(e);
				//driver.close();
			}
			else {
				System.out.println(e);
			}
		}
		

}
}