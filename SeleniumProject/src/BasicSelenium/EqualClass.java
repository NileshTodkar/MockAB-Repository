package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EqualClass {
	WebDriver driver;
	String ExpURL = "https://www.facebook.com//";
	String ExpTitle="Facebook- log in or sign up";
	public void verifyURL() {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		String ActURL=driver.getCurrentUrl();
		if(ExpURL.equals(ActURL)) {
			System.out.println("pass  " + ActURL);
			}
		else {
			System.out.println("fail  " + ActURL);
		}
	}
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		String ActTitle=driver.getTitle();
		if(ExpTitle.equals( ActTitle)) {
			System.out.println("pass  " +  ActTitle);
			}
		else {
			System.out.println("fail  " + ActTitle);
		}
	}
public static void main(String args []) throws InterruptedException {
	
		EqualClass obj=new EqualClass();
		obj.verifyURL();
		obj.verifyTitle();
}
}