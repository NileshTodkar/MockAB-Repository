package Selenium18June.MyMavenProject;
import Selenium18June.MyMavenProject.HomePage3;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestHomePage3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();   
	driver.manage().deleteAllCookies(); 
	driver.get("https://www.demoblaze.com/");
	Thread.sleep(2000);
	HomePage3 hp=new HomePage3(driver);
	hp.clickonLaptopsLink();
	try {
	hp.clickonSonyLink();
	}
	catch(StaleElementReferenceException e){
		hp.clickonSonyLink1();
	}
}
}