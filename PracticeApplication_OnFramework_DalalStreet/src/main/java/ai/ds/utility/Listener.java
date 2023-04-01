package ai.ds.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.testBase.TestBase;

public class Listener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TestCase Execution Started "+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase Execution Success "+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("TestCase Execution Failed "+result.getName());
		UtilClass.takesScreenshot(result.getName()+System.currentTimeMillis());
		logger.info("Take Screenshot");

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("TestCase Execution Skipped "+result.getName());

	}


}
