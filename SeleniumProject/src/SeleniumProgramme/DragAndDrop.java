package SeleniumProgramme;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
	WebDriver driver = new ChromeDriver(); // upcasting
	driver.manage().window().maximize();   //maximize the chrome browser window
	driver.manage().deleteAllCookies();   // delete all privious coockies;
	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0); //handle the I-Frame
	
	//WebElement Source= driver.findElement(By.xpath("//div[ @ id='draggable']"));// stoare the source location.
	//WebElement target= driver.findElement(By.xpath("//div[ @ id='droppable']"));// stoare the target location.
	Actions a=new Actions(driver);
	
	// 1)dragAndDrop(WebElementSource, WebElementtarget).perform(); for Drag & Drop.

	//a.clickAndHold(Source).moveToElement(target).release().build().perform();
	
	//Thread.sleep(3000);
	//driver.navigate().refresh();   //To Refesh the page
   
	//2)dragAndDrop(Source, xOffset,yOffset).perform(); for Drag & Drop. 
	//WebElement Source1= driver.findElement(By.xpath("//div[ @ id='draggable']"));// stoare the source location.
	 //   a.dragAndDropBy(Source1, 70,120).perform();
	    
	 // Thread.sleep(3000);
	//  driver.navigate().refresh();   //To Refesh the page
    
   
    
		    
	//3)dragAndDrop(Source, target).perform(); for Drag & Drop. 
	  WebElement Source2= driver.findElement(By.xpath("//div[ @ id='draggable']"));// stoare the source location.
		WebElement target2= driver.findElement(By.xpath("//div[ @ id='droppable']"));// stoare the target location.
	    a.dragAndDrop(Source2, target2).perform();
	    
	    Thread.sleep(3000);
	
	    driver.close();
	
	
	}

}
