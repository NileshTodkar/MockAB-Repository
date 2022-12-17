package ai.DalalStreet.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DalalStreet.PageLayer.LoginPage;
import ai.DalalStreet.TestBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void VerifyLoginPage() throws InterruptedException {
		String Expected_url="https://apps.dalalstreet.ai/dashboard";
		String Actual_url=login.geturl();
		System.out.println(Actual_url);
		Assert.assertEquals(Expected_url, Actual_url);
		
	}

}
