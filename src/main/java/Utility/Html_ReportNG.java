package Utility;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class  Html_ReportNG 
{
	ExtentReports extent;
	
	public static ExtentReports report()
	{
		
	
	String PROJECT_DIR=Path.getProjectDir();
	ExtentSparkReporter Reporter =new ExtentSparkReporter(PROJECT_DIR+"\\Reports\\index.html");
	Reporter.config().setDocumentTitle("Intelliante - Test Automation Report");
	Reporter.config().setReportName("qa-web-automation");
	
	ExtentReports extent= new ExtentReports();
	extent.attachReporter(Reporter);
	extent.setSystemInfo("Tester", "Isar");
	extent.setSystemInfo("Environment", "QA");
	return extent;
	
	
    }
	
	
	
}
