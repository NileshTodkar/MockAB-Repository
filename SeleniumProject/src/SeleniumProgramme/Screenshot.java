package SeleniumProgramme;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path="E:\\Velocity Software Testing Cource\\Screenshot\\amezone.png";
		File Destination=new File(path);
		FileHandler.copy(Source, Destination);
	}

}
