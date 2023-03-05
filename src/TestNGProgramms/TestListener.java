package TestNGProgramms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method Started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method Passed"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method Failed"+result.getName());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method Skipped"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method failed with certain success percentage"+result.getName());
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Method failed due to timeout"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinished method Finished");
		
	}
  
  }
