package Selenium18June.MyMavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class HomePage {
	private WebElement ProductStore;
	private WebElement B_logo;
	private WebElement Home;
	private WebElement contact;
	private WebElement Aboutus;
	private WebElement cart;
	private WebElement login;
	private WebElement signup;
	private WebElement closecontact;
	private WebElement closeAboutus;
	private WebElement closeLogin;
	private WebElement closeSignup;
	private WebElement leftshift;
	private WebElement rightshift;
	private WebElement Phone;
	private WebElement Computer;
	private WebElement Monitors;
	
	public HomePage(WebDriver driver) {
		ProductStore=driver.findElement(By.xpath("//a[@id=\"nava\"]"));
		 B_logo=driver.findElement(By.xpath("//img[@src='bm.png']"));
		 Home=driver.findElement(By.xpath("//a[@class='nav-link']"));
		 contact=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		 Aboutus=driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		 cart=driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));
		 login=driver.findElement(By.xpath("(//a[@class='nav-link'])[5]"));
		 signup=driver.findElement(By.xpath("(//a[@class='nav-link'])[8]"));
		 closecontact= driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		 closeAboutus= driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[4]"));
		 closeLogin= driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[6]"));
		 closeSignup= driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[2]"));
		 leftshift= driver.findElement(By.xpath("//span[@class='carousel-control-prev-icon']"));
		 rightshift= driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
		 Phone=driver.findElement(By.xpath("(//a[@id='itemc'])[1]"));
		 Computer=driver.findElement(By.xpath("(//a[@id='itemc'])[2]"));
		 Monitors=driver.findElement(By.xpath("(//a[@id='itemc'])[3]"));
	}
	 public void clickOnProductStore() {
		 ProductStore.click();
			}
	 public void clickOnB_logo() {
		 B_logo.click();
			}
	 public void clickOnHome() {
		 Home.click();
			}
	 public void clickOncontact() throws InterruptedException {
		 contact.click();
		 Thread.sleep(1000);
		 closecontact.click();
			}
	 public void clickOnAboutus() throws InterruptedException {
		 Aboutus.click();
		 Thread.sleep(1000);
		 closeAboutus.click();
			}
	 public void clickOncart()  {
		 cart.click();
		}
	 
	 public void clickOnlogin() throws InterruptedException {
		 login.click();
		 Thread.sleep(2000);
		 closeLogin.click();
			}
	
	 public void clickOnsignup() throws InterruptedException {
		 signup.click();
		 Thread.sleep(2000);
		 closeSignup.click();
			}
	 public void imageLeftRightShift() throws InterruptedException {
		 leftshift.click();
		 Thread.sleep(1000);
		 leftshift.click();
		 Thread.sleep(2000);
		 rightshift.click();
		 Thread.sleep(1000);
		 rightshift.click();
			}
	 public void clickOnComputer() throws InterruptedException {
		 Computer.click();
		 Thread.sleep(2000);
		 Monitors.click();
		 Thread.sleep(2000);
		 Phone.click();
		 Thread.sleep(2000);
		
	}
}