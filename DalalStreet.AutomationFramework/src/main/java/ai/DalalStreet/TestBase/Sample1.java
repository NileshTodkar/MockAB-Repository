package ai.DalalStreet.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class Sample1 extends TestBase {
	@DataProvider(name="CompanyNames")
	public String[] CompanyNames() {
		
		String[] obj= {"Axis","WIPRO","HDFC BANK","HCL TECHNOLOGIES"};
		return obj;
		
	}
	@Test(dataProvider="CompanyNames")
	public void BuyFunctionality(String name) throws InterruptedException {
		String ExpectedStatus="Order Created successfully";
		dash.enterComapanyName(name);
		dash.selectCompanyOption();
		Thread.sleep(3000);
		 Trans.clickonBuy1();
		 Trans.enterShareQuantity("10");
		 Trans.clickonBuy2();
		 Thread.sleep(3000);
		 String ActualStatus=Trans.getStatus();
		 System.out.println(ActualStatus);
		 Assert.assertEquals(ExpectedStatus,ActualStatus);
		 
	}

}
