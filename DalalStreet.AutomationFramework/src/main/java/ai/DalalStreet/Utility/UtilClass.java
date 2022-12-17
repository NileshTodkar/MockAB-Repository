package ai.DalalStreet.Utility;

import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import ai.DalalStreet.TestBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass () {
		PageFactory.initElements(driver, this);
	}
	
	public static void takesScreenshot(String filename)  {
	
		try {
		TakesScreenshot ts= (TakesScreenshot)driver;
		Calendar time=Calendar.getInstance();
		String timestamp=time.toString().replace(":", "").replace(" ", "");
		
		     File source=ts.getScreenshotAs(OutputType.FILE);
		     File Destination=new File("D:\\eclipse\\DalalStreet.AutomationFramework\\Screenshot\\"+filename+".png");
				FileHandler.copy(source, Destination);
				
			} catch (IOException e) {
				
				System.out.println("Provide correct path");
				
				
			}
		
	}
	
	

}
