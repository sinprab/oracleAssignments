package oracle.assignmnet.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import oracle.assignmnet.utilities.PropertyReader;

public class DriverManager {

	public static WebDriver driver;
	

	public static void setDriver() {
		
		try
		{
		String browser = PropertyReader.getProperty("browser");
		String driverPath;
		switch(browser)
		{
		case "firefox" : driverPath	= PropertyReader.getProperty("firefoxDriverPath");
						 System.setProperty("webdriver.gecko.driver",driverPath);
						 driver = new FirefoxDriver();
						 break;
						 
		case "chrome" : driverPath	= PropertyReader.getProperty("chromeDriverPath");
		 				System.setProperty("webdriver.chrome.driver",driverPath);
		 				driver = new ChromeDriver();
		 				break;
		
		default 	 : System.out.println("Incorrect Broswer Name !!");
					   driver = null;
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
