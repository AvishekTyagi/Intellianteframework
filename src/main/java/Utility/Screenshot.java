package Utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	
	
	public  String getScreenshot(String TestCaseName, WebDriver driver)
	{        
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;  
			File source = ts.getScreenshotAs(OutputType.FILE);
			File file = new File (System.getProperty("user.dir") + "//Screenshots//" + TestCaseName + ".png");
			FileUtils.copyFile(source, file);
			return System.getProperty("user.dir") + "//Screenshots//" + TestCaseName + ".png";
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

}
