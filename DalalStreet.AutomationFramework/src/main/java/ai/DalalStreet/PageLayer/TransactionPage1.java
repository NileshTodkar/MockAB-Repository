package ai.DalalStreet.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DalalStreet.TestBase.TestBase;

public class TransactionPage1 extends TestBase{
	
	public TransactionPage1(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='2']")
	private WebElement button_2;
private By data1=By.xpath("//table/tbody/tr[2]/td[2]"); // 1st opproach to fetch the data

public String getdata() {
	
	String data2=driver.findElement(data1).getText();
	return data2;
}
public String getdata1() // 2nd opproach to fetch the data
{
	
	String data0=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
	return data0;
}

public void getAllDataofPage1() // 2nd opproach to fetch the data
{
	for(int i=1;i<=10;i++) {
		for(int j=1;j<10;j++) {
	String data0=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.print(data0+" ");
	}
		System.out.println(" ");
	}
}
public void getAllDataofPage2() throws InterruptedException // 2nd opproach to fetch the data
{
	 button_2.click();
	 System.out.println(" ");
	 Thread.sleep(3000);
	for(int i=1;i<=10;i++) {
		for(int j=1;j<10;j++) {
	String data0=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.print(data0+" ");
	}
		System.out.println(" ");
	}
}
}
