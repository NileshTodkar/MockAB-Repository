package ai.DalalStreet.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.DalalStreet.TestBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Execution Started");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Case Pass");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Case Failed");
		UtilClass.takesScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Case Skipped");
		
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
