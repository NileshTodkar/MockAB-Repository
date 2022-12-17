package ai.DalalStreet.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DalalStreet.PageLayer.SignupPage;
import ai.DalalStreet.TestBase.TestBase;

public class SignupPageTest extends TestBase {
	@Test
	public void verifySignupPage() {
	
		 SignupPage  sign =new  SignupPage();
		 sign.clickonlink();
		 sign.enterFirstName("Nilesh");
		 sign.enterLastName("Todkar");
		sign.enterEmailID("todkarnilesh21@gmail.com");
		sign.enterPassword("Nilesh@12345");
		sign.clickonCheckbox();
		sign.clickonGetyourjourneyStarted();
		String actual_url= sign.getactualurl();
		System.out.println(actual_url);
		
		
	}
	
	
	
}
