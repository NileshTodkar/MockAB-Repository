package ai.DalalStreet.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.DalalStreet.TestBase.TestBase;

public class GetdatafromTransactionPage extends TestBase {
	
	@Test
	public void getdata() throws InterruptedException {
		
		Trans.getTrasactionPage();
		System.out.println(Trans1.getdata());
		System.out.println(Trans1.getdata1());
		Trans1.getAllDataofPage1();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(1155,716)");
		Thread.sleep(3000);
		Trans1.getAllDataofPage2();
	}

	

}
