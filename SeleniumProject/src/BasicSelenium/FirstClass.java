package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstClass {
	public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/login/");
		 driver.getTitle();
		   String Title= driver.getTitle();
		   System.out.println(Title);
		   driver.getCurrentUrl();
		   String url=  driver.getCurrentUrl();
		   System.out.println(url);
		driver.navigate().to("https://paytm.com/recharge-bill-payment");
		Thread.sleep(3000);
		 driver.getTitle();
		    Title= driver.getTitle();
		   System.out.println(Title);
		   driver.getCurrentUrl();
		   url=  driver.getCurrentUrl();
		   System.out.println(url);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
