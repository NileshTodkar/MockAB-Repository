package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
