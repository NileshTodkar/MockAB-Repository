package ai.DalalStreet.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DalalStreet.PageLayer.DashBoardPage;
import ai.DalalStreet.PageLayer.LoginPage;
import ai.DalalStreet.PageLayer.TransactionPage;
import ai.DalalStreet.TestBase.TestBase;

public class BuyShare extends TestBase {
	@Test
	public void BuyShareFunctionalityAxis() throws InterruptedException {
		
		String ExpectedStatus="Order Created successfully";
		dash.enterComapanyName("Axis");
		dash.selectCompanyOption();
		
		logger.info("Company Selected");
		
		Thread.sleep(3000);
		 Trans.clickonBuy1();
		 Trans.enterShareQuantity("10");
		 Trans.clickonBuy2();
		 Thread.sleep(3000);
			logger.info("Share Buy Successfully");
			
		 String ActualStatus=Trans.getStatus();
		 System.out.println(ActualStatus);
		 Assert.assertEquals(ExpectedStatus,ActualStatus);
		 
	}
	@Test
	public void BuyShareFunctionalityWIPRO() throws InterruptedException {
		
		String ExpectedStatus="Order Created successfully";
		dash.enterComapanyName("wipro");
		dash.selectCompanyOption();
		
		logger.info("Company Selected");
		
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
