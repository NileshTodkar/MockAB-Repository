package Selenium18June.MyMavenProject;
import Selenium18June.MyMavenProject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestHomePage {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.manage().deleteAllCookies(); 
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		
		HomePage hp=new HomePage(driver);
		
         hp.clickOnB_logo();
          Thread.sleep(1000);
           driver.navigate().back(); 
           
          hp.clickOnProductStore();
           Thread.sleep(1000);
          driver.navigate().back(); 
          
          hp.clickOnHome();
          Thread.sleep(1000);
          driver.navigate().back();
          
          hp.clickOncontact();
          Thread.sleep(1000);
          
          hp.clickOnAboutus();
          Thread.sleep(1000); 
          
          hp.clickOncart();
          driver.navigate().back(); 
          Thread.sleep(1000);
          
          hp.clickOnlogin();
          Thread.sleep(1000);
          
          hp.clickOnsignup();
          Thread.sleep(1000);
          
          hp.imageLeftRightShift();
          Thread.sleep(2000);
          
          hp.clickOnComputer();
          Thread.sleep(3000);
          driver.close();
          
      }
}