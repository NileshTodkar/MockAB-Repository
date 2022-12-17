package Selenium18June.MyMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage3 {
	//POM is made up of 3 things:1)Declaration 2)Initialization 3)Usage
	
	private WebElement LaptopsLink;
	private WebElement Sony ;
	private WebElement Sony1 ;

	public HomePage3(WebDriver driver){
		
		LaptopsLink=driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
		Sony=driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
		Sony1=driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
    }
	
	
	public void clickonLaptopsLink() throws InterruptedException  {
		LaptopsLink.click();
		Thread.sleep(3000);
	  }
         public void clickonSonyLink() throws InterruptedException  {
              Sony.click();
		    Thread.sleep(3000);
		    
      }
         
    public void clickonSonyLink1() throws InterruptedException  {
    	      Sony=Sony1;
        	  Sony.click();
		      Thread.sleep(3000);
        	  }	
        	
	}

