package ManageDriver;



import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Config.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers implements Configuration {
		
	public WebDriver driver;                                                       
    public Actions act;
    public WebDriverWait stop;
   // public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    
    
    @BeforeTest(alwaysRun = true)
	public WebDriver initalizedriver() throws IOException {
		
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();	
		    
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("headless"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicitWait)));
		act=new Actions (driver);
		stop= new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(ExplicitWait))); 
		return driver;
		
	}
    
   /* @BeforeMethod(alwaysRun = true)
	public void setUp(ITestContext context) throws IOException {

		WebDriver driver = initalizedriver(browserName);
		threadLocalDriver.set(driver);
		System.out.println("Before Test Thread ID: " + Thread.currentThread().threadId());
		getDriver().manage().window().maximize();
	}
    
    public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}  
    */
   
    @AfterTest(alwaysRun = true)
	public void tearDown() {
    	driver.quit();
		//System.out.println("After Test Thread ID: " + Thread.currentThread().threadId());
		//threadLocalDriver.remove();
	}

 
        
    public void pause(int sec)
    {    
        int milisec;
    	milisec=sec*1000;
    	act.pause(milisec);
    }

	public void goto_one_chat() throws IOException
	{  
		driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTQ5MzU0LCJqdGkiOiIzYzQ5YmFkMS01YWI3LTRjZmUtYmJlOC1hZTlmZTA0ZmFhMDUiLCJ1c2VyIjp7ImlkIjo0NjMsImVtYWlsIjoicm9uYWtlODg4NkBsdWJkZS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjoicHJha2FzaCIsImxhc3RfbmFtZSI6InBvdWRlbCIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1DU0UifV0sImFwcGxpY2FudF9pZCI6NDYzLCJkYXNoYm9hcmRfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5hcHBsaWNhbnQtc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20iLCJqb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudF9pZCI6MTY1OSwic2NvcmVfc3VibWlzc2lvbl91cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY1OSIsIm1ldGhvZCI6IlBBVENIIn0sImFzc2Vzc21lbnRfc3RhdHVzX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjU5L3N0YXR1cyIsIm1ldGhvZCI6IkdFVCJ9LCJpc19jdl9wZXJtaXR0ZWQiOm51bGwsImN2X2ltYWdlX2NhcHR1cmVfaW50ZXJ2YWwiOm51bGwsImJhc2VfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEifQ.rDfFfxJ870QsP_m0k93da16ybrXjKcPQ9cg6aBQ1pFhmdSVVEL4exKWhQMRDbEmEt3P0whK_pCg1r1fKfwqzgA&test=true");
	}
	public void goto_two_chat() throws IOException
	{  
		driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTUyNTM2LCJqdGkiOiJkMzk0N2E1Zi1lNzJmLTRmODQtODI3ZC0wZDIxZWNkNWYyNzMiLCJ1c2VyIjp7ImlkIjo0NjksImVtYWlsIjoia2FzZWxlajY3NUBwYXh2ZW4uY29tIiwidHlwZSI6IkFwcGxpY2FudHM6OlVzZXIifSwiZmlyc3RfbmFtZSI6IkFubmEiLCJsYXN0X25hbWUiOiJFdmFucyIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1DU0UifSx7ImlkIjoyLCJjb2RlIjoiTUNTQSJ9XSwiYXBwbGljYW50X2lkIjo0NjksImRhc2hib2FyZF91cmwiOiJodHRwczovL3RydWVtYXJrLmFwcGxpY2FudC1zdGFnaW5nLmludGVsbGlhbnRlLmNvbSIsImpvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50X2lkIjoxNjY2LCJzY29yZV9zdWJtaXNzaW9uX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjY2IiwibWV0aG9kIjoiUEFUQ0gifSwiYXNzZXNzbWVudF9zdGF0dXNfdXJsIjp7InVybCI6Imh0dHBzOi8vdHJ1ZW1hcmsucGxhdGZvcm0tc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20vYXBpL3YxL2FwcGxpY2FudHMvam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRzLzE2NjYvc3RhdHVzIiwibWV0aG9kIjoiR0VUIn0sImlzX2N2X3Blcm1pdHRlZCI6bnVsbCwiY3ZfaW1hZ2VfY2FwdHVyZV9pbnRlcnZhbCI6bnVsbCwiYmFzZV91cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MSJ9.rLuHKZGLcjtH38g_0z6c_YxmNrvQJrNbrsFixPVpEwhqEN2MKy4IU9adNvY8Jbvh220PrS4xQZszjc9I3On8JA&test=true");
	}
	public void goto_three_chat() throws IOException
	{  
		driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTUyNTM2LCJqdGkiOiJkMzk0N2E1Zi1lNzJmLTRmODQtODI3ZC0wZDIxZWNkNWYyNzMiLCJ1c2VyIjp7ImlkIjo0NjksImVtYWlsIjoia2FzZWxlajY3NUBwYXh2ZW4uY29tIiwidHlwZSI6IkFwcGxpY2FudHM6OlVzZXIifSwiZmlyc3RfbmFtZSI6IkFubmEiLCJsYXN0X25hbWUiOiJFdmFucyIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1DU0UifSx7ImlkIjoyLCJjb2RlIjoiTUNTQSJ9LHsiaWQiOjMsImNvZGUiOiJNQ1NVIn1dLCJhcHBsaWNhbnRfaWQiOjQ2OSwiZGFzaGJvYXJkX3VybCI6Imh0dHBzOi8vdHJ1ZW1hcmsuYXBwbGljYW50LXN0YWdpbmcuaW50ZWxsaWFudGUuY29tIiwiam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRfaWQiOjE2NjYsInNjb3JlX3N1Ym1pc3Npb25fdXJsIjp7InVybCI6Imh0dHBzOi8vdHJ1ZW1hcmsucGxhdGZvcm0tc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20vYXBpL3YxL2FwcGxpY2FudHMvam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRzLzE2NjYiLCJtZXRob2QiOiJQQVRDSCJ9LCJhc3Nlc3NtZW50X3N0YXR1c191cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY2Ni9zdGF0dXMiLCJtZXRob2QiOiJHRVQifSwiaXNfY3ZfcGVybWl0dGVkIjpudWxsLCJjdl9pbWFnZV9jYXB0dXJlX2ludGVydmFsIjpudWxsLCJiYXNlX3VybCI6Imh0dHBzOi8vdHJ1ZW1hcmsucGxhdGZvcm0tc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20vYXBpL3YxIn0.hsyz6nBhkw9QPBWGlZbV7J0dOqzrCcrOSC_38aFOuocx0RZWka7UgdZwTxxw-tp3P-eesCsM75wJwD2EfdINAQ&test=true");
	}
    public void goto_typing()
    {
    	driver.get("https://truemark.dev.intelliante.com/itk/dashboard?session_token=eyJraWQiOiJMU1dWVFJDcGNyMzlya0VsdkR0T2RSSzlJaDNfMkk3alBaZTJXSEI1LU9zIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjgzODc1NDQ5LCJqdGkiOiIzMzFkNTdjYS0zOTI3LTQ1MzItOGVkNy03ODA1NjlmY2ZhNzIiLCJ1c2VyIjp7ImlkIjoxNjYwLCJlbWFpbCI6InJvdG9tNDQ0NDNAYW5kb3JlbS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjpudWxsLCJsYXN0X25hbWUiOm51bGwsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpudWxsLCJhcHBsaWNhbnRfaWQiOjE2NjAsImRhc2hib2FyZF91cmwiOiJodHRwczovL3RydWVtYXJrLmRldi5pbnRlbGxpYW50ZS5jb20vYXBwbGljYW50Iiwiam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRfaWQiOjI3NDIsInNjb3JlX3N1Ym1pc3Npb25fdXJsIjp7InVybCI6Imh0dHBzOi8vdHJ1ZW1hcmsuZGV2LmludGVsbGlhbnRlLmNvbS9hcGkvYXBpL3YxL2FwcGxpY2FudHMvam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRzLzI3NDIiLCJtZXRob2QiOiJQQVRDSCJ9LCJhc3Nlc3NtZW50X3N0YXR1c191cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5kZXYuaW50ZWxsaWFudGUuY29tL2FwaS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMjc0Mi9zdGF0dXMiLCJtZXRob2QiOiJHRVQifSwiYXNzZXNzbWVudF9jb25maWdfdXJsIjp7InVybCI6Imh0dHBzOi8vdHJ1ZW1hcmsuZGV2LmludGVsbGlhbnRlLmNvbS9hcGkvYXBpL3YxL2FwcGxpY2FudHMvam9iX2FwcGxpY2F0aW9uX2Fzc2Vzc21lbnRzLzI3NDIvYXNzZXNzbWVudF9jb25maWciLCJtZXRob2QiOiJHRVQifSwiaXNfY3ZfcGVybWl0dGVkIjp0cnVlLCJjdl9pbWFnZV9jYXB0dXJlX2ludGVydmFsIjpudWxsLCJiYXNlX3VybCI6Imh0dHBzOi8vdHJ1ZW1hcmsuZGV2LmludGVsbGlhbnRlLmNvbS9hcGkvYXBpL3YxIn0.jmThy-sk8p-eqvKK0KKfGc-60lQkJ7jAy3qvJe6aFrVwMqaXzO78OFA9WJ9hm9SLFjvaY3b-eTlX5UIOIaA97Q&test=true");
    }
    public void goto_VoiceService()
    {
    	driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTQ5MzU0LCJqdGkiOiIzYzQ5YmFkMS01YWI3LTRjZmUtYmJlOC1hZTlmZTA0ZmFhMDUiLCJ1c2VyIjp7ImlkIjo0NjMsImVtYWlsIjoicm9uYWtlODg4NkBsdWJkZS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjoicHJha2FzaCIsImxhc3RfbmFtZSI6InBvdWRlbCIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1WU0UifV0sImFwcGxpY2FudF9pZCI6NDYzLCJkYXNoYm9hcmRfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5hcHBsaWNhbnQtc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20iLCJqb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudF9pZCI6MTY1OSwic2NvcmVfc3VibWlzc2lvbl91cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY1OSIsIm1ldGhvZCI6IlBBVENIIn0sImFzc2Vzc21lbnRfc3RhdHVzX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjU5L3N0YXR1cyIsIm1ldGhvZCI6IkdFVCJ9LCJpc19jdl9wZXJtaXR0ZWQiOm51bGwsImN2X2ltYWdlX2NhcHR1cmVfaW50ZXJ2YWwiOm51bGwsImJhc2VfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEifQ.bYJDcrKSS_VB_ftRbO7Bj4r1a8XSeF4vo0xcfymBJjGzv-sL3oIWfcoDH1C3b0ez81XUw_HAb7FP0wqe4TES4Q&test=true");
    }
}
