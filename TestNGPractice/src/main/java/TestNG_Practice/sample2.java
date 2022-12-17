package TestNG_Practice;

import org.testng.annotations.Test;

public class sample2 {
	@Test(priority=3)
	public void abc() {
		
		System.out.println("abc Method");
	}
	@Test(priority=2)
	public void xyz() {
		
		System.out.println("xyz Method");
	}
	@Test(priority=1)
	public void pqr() {
		
		System.out.println("pqr Method");
	}
}
