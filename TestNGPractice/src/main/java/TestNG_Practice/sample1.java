package TestNG_Practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample1 {
	@Test
	public void abc() {
		
		System.out.println("abc Method");
	}
	@Test
	public void xyz() {
		
		System.out.println("xyz Method");
		Assert.fail();
	}
	@Test
	public void pqr() {
		
		System.out.println("pqr Method");
		SoftAssert obj=new SoftAssert();
		obj.assertNotNull(obj);
		obj.assertAll();
	}
}
