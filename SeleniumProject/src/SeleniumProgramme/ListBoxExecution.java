package SeleniumProgramme;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExecution {
public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe"); // key & value for chrome driver
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();   //maximize the chrome browser window
		driver.manage().deleteAllCookies();   // delete all privious coockies;
		driver.get("https://www.facebook.com/signup");
		//To Select Date From ListBoX
		WebElement Date= driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(Date);
		s.selectByIndex(11);
		
		//To Select Month From ListBoX
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select t=new Select(month);
		t.selectByValue("5");
		
		//To Select Year From ListBoX
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select u=new Select(year);
		u.selectByVisibleText("1996");
		
		//to count all options of Date List Box
				List<WebElement> all_options=s.getOptions(); 
				int count=all_options.size();
				System.out.println(count);
		
		//to print all options of Date List Box
		for(int i=0;i<count;i++) {
			String obj=all_options.get(i).getText();
			//System.out.println(obj);
			/*To Find count of List box we have to take reference Variable of 
			Particular that ListBox means for Month use 't',for Year use 'u' */
			}

        }
    }

