package Utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ManageDriver.Drivers;


public class Listeners extends Drivers implements ITestListener
{   ExtentTest test;
	ExtentReports extent= Html_ReportNG.report();
	Screenshot screen=new Screenshot();
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getMethod().getMethodName());   
		extentTest.set(test);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test_Pass");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().log(Status.FAIL, "Test_Fail");
		extentTest.get().fail(result.getThrowable());
		try {
			driver= (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String filePath= screen.getScreenshot(result.getMethod().getMethodName(),driver);
		extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	
}
