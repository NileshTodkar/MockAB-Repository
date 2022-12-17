package Selenium18June.MyMavenProject;
import Selenium18June.MyMavenProject.HomePage2PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestHomePage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.manage().deleteAllCookies(); 
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		HomePage2PF hp=new HomePage2PF(driver);
		hp.clickOnLaptops();
		hp.clickOnMonitors();
		hp.clickOnPhones();
		driver.close();

	}

}
