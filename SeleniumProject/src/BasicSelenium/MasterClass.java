package BasicSelenium;
import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MasterClass {
	public static void main(String args []) {
	
		ImpementationOfGenerelization a= new ImpementationOfGenerelization();
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Java\\geckodriver.exe");
		a.chrome();
		WebDriver driver =new ChromeDriver();
	 	//a.fireFox();
		//Dimension d=new Dimension();
		 driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		
		
	}

}
