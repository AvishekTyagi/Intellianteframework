package Config;

import java.util.Properties;



import Utility.Path;
import Utility.PropertiesFile;


public interface Configuration {

	String PROJECT_DIR= Path.getProjectDir();
	Properties genericsConfig = PropertiesFile.read(PROJECT_DIR + "\\Globalconfig.properties");
	
	String browserName=genericsConfig.getProperty("browser");
	String implicitWait=genericsConfig.getProperty("implicit_wait");
	String ExplicitWait=genericsConfig.getProperty("Explicit_wait");
	
 
}
