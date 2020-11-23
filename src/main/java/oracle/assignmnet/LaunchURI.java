package oracle.assignmnet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import oracle.assignmnet.driverFactory.DriverManager;
import oracle.assignmnet.pages.ContainersPage;

public class LaunchURI extends DriverManager{
	
	public static void launchMyURI()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try
		{
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "D:\\Softwares\\geckodriver-v0.28.0-win64\\geckodriver.exe"); WebDriver
			 * driver = new FirefoxDriver();
			 */
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement containerTab = driver.findElement(By.xpath("//div//div[1]//div[2]//div[1]//button[2]"));
        WebElement docker = driver.findElement(By.xpath("//div//div[1]//div[2]//div[1]//button[1]"));
        
        if(containerTab.isSelected())
        {
        	System.out.println("Conatiner tab is Selected");
        }
        else
        {
        	System.out.println("Conatiner tab is not Selected");
        }
		
        if(docker.isSelected())
        {
        	System.out.println("Docker tab is Selected");
        }
        else
        {
        	System.out.println("Docker tab is not Selected");
        }
	
		
		System.out.println("Successfull !!");
		driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception occoured :: "+e);
			driver.close();
		}
	}
	
	public static void main(String[] args) {
		/*
		 * DriverManager.setDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get("https://hub.docker.com/search");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * ContainersPage containerpage = new ContainersPage();
		 * containerpage.verifyLandingTab();
		 * containerpage.isVerifiedPublisherACheckBox();
		 * containerpage.isOfficialImageACheckBox();
		 * containerpage.isAnalyticsACheckBox(); containerpage.isBaseImageACheckBox();
		 * containerpage.isDataBaseACheckBox(); containerpage.isStorageACheckBox();
		 * containerpage.clickVerifedPublisherCheckbox();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * containerpage.checkFilterPublishContentIsDisplayed();
		 * containerpage.clickDataBaseCheckbox();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * containerpage.clickBaseImageCheckbox();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * containerpage.checkForAllCurrentFilters();
		 * containerpage.cancelDataBaseFilter();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * containerpage.checkDatabaseCheckBoxIsUnchecked();
		 * 
		 * 
		 * driver.close();
		 */
	}

}
