package oracle.assignmnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import oracle.assignmnet.driverFactory.DriverManager;
import oracle.assignmnet.reporting.ScreenCapture;


public class ContainersPage extends DriverManager {
	
	WebElement containerTab = driver.findElement(By.xpath("//div//div[1]//div[2]//div[1]//button[text()='Containers']"));
	
	WebElement verifiedPublisher = driver.findElement(By.xpath(".//*[@id='imageFilterList']/div[2]/div[1]/input"));
	WebElement verifiedPublisherLabel = driver.findElement(By.xpath(".//*[@id='imageFilterList']/div[2]/div[1]/div/label/div/span[1]"));
	
	WebElement officialImage = driver.findElement(By.xpath(".//*[@id='imageFilterList']/div[2]/div[2]/input"));
	WebElement officialImageLabel = driver.findElement(By.xpath(".//*[@id='imageFilterList']/div[2]/div[2]/div/label/div/span[1]"));
	
	WebElement analytics = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[1]/input"));
	WebElement analyticsLabel = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[1]/div/label"));
	
	WebElement baseImage = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[5]/input"));
	WebElement baseImageLabel = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[5]/div/label"));
	
	WebElement dataBase = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[6]/input"));
	WebElement dataBaseLabel = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[6]/div/label"));
	
	WebElement storage = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[14]/input"));
	WebElement storageLabel = driver.findElement(By.xpath(".//*[@id='categoriesFilterList']/div[2]/div[14]/div/label"));
	
	
	public void verifyLandingTab(ExtentTest test)
	{
		if(containerTab.isDisplayed())
		{
			if(containerTab.getAttribute("class").contains("styles__productTab___2YNtd styles__selectedClass"))
			{
				
				 
				test.log(LogStatus.PASS, "Landing Tab is Container Tab");
				
			}
			else
			{
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Landing Tab is not Container Tab");
				
			}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Container Tab is not displayed");
			
		}
	}
	
	public void isVerifiedPublisherACheckBox(ExtentTest test)
	{
		if(verifiedPublisher.isEnabled())
		{
		if(verifiedPublisher.getAttribute("type").equals("checkbox"))
		{	
			if(verifiedPublisherLabel.getText().equals("Verified Publisher"))
			{
			
			 
			test.log(LogStatus.PASS, "Verified publisher is Present and it is a checkbox with label name Verified Publisher");
			
			}
			else
			{
				
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Verified publisher is Present and it is a checkbox with label mismatch");
				
			}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Verified publisher is Present but it is not a checkbox");
			
		}
		}
		else
		{
			System.out.println("Verified publisher is not Present");
			 
		}
	}
	
	public void isOfficialImageACheckBox(ExtentTest test)
	{
		if(officialImage.isEnabled())
		{
		if(officialImage.getAttribute("type").equals("checkbox"))
		{	
			if(officialImageLabel.getText().equals("Official Images"))
			{
				
				 
				test.log(LogStatus.PASS, "Offcial Image is Present and it is a checkbox with label name Offcial Image");
			}
			else
			{
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Offcial Image is Present and it is a checkbox with label mismatch");
					
			}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Offcial Image is Present but it is not a checkbox");
				
		}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Offcial Image is not Present");
			
		}
	}
	
	public void isAnalyticsACheckBox(ExtentTest test)
	{
		if(analytics.isEnabled())
		{
		if(analytics.getAttribute("type").equals("checkbox"))
		{	
			if(analyticsLabel.getText().equals("Analytics"))
			{
				 
				test.log(LogStatus.PASS, "Analytics is Present and it is a checkbox with label name Analytics");
			}
			else
			{
				
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Analytics is Present and it is a checkbox with label mismatch");
					
			}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Analytics is Present but it is not a checkbox");
				
		}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Analytics is not Present");
			
		}
	}
	
	public void isBaseImageACheckBox(ExtentTest test)
	{
		if(baseImage.isEnabled())
		{
		if(baseImage.getAttribute("type").equals("checkbox"))
		{	
			if(baseImageLabel.getText().equals("Base Images 1"))
			{
				
				 
				test.log(LogStatus.PASS, "Base Images is Present and it is a checkbox with label name Base Images");
			}
			else
			{
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Base Images 1 is Present and it is a checkbox but there is label mismatch as "+baseImageLabel.getText());
				
			}
		}
		else
		{
			
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Base Images is Present but it is not a checkbox");
			
		}
		}
		else
		{
		
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Base Images is not Present");
			
		}
	}
	
	public void isDataBaseACheckBox(ExtentTest test)
	{
		if(dataBase.isEnabled())
		{
		if(dataBase.getAttribute("type").equals("checkbox"))
		{	
			if(dataBaseLabel.getText().equals("Databases"))
			{
				 
				test.log(LogStatus.PASS, "Databases is Present and it is a checkbox with label name Databases");
			}
			else
			{
				
				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Databases is Present and it is a checkbox with label mismatch");
			}
		}
		else
		{
			
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Databases is Present but it is not a checkbox");
		}
		}
		else
		{
			
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Databases is not Present");
		}
	}
	
	public void isStorageACheckBox(ExtentTest test)
	{
		if(storage.isEnabled())
		{
		if(storage.getAttribute("type").equals("checkbox"))
		{	
			if(storageLabel.getText().equals("Storage"))
			{
				
				 
				test.log(LogStatus.PASS, "Storage is Present and it is a checkbox with label name Storage");
			}
			else
			{
				
				
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Storage is Present and it is a checkbox but there is a label mismatch");
			}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Storage is Present but it is not a checkbox");
		}
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Storage is not Present");
		}
	}
	
	public void clickVerifedPublisherCheckbox(ExtentTest test)
	{
		try
		{
		verifiedPublisher.click();
	
		 
		test.log(LogStatus.PASS, "Verified Publisher Checkbox is checked");
		}
		catch(Exception e)
		{
		
		 
		test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Verified Publisher Checkbox is not checked");
		e.printStackTrace();
		}
	}
	
	public void clickBaseImageCheckbox(ExtentTest test)
	{
		try
		{
		baseImage.click();
		
		 
		test.log(LogStatus.PASS, "Base Image Checkbox is checked");
		}
		catch(Exception e)
		{
		
		 
		test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Base Image Checkbox is not checked");
		e.printStackTrace();
		}
	}
	
	public void clickDataBaseCheckbox(ExtentTest test)
	{
		try
		{
		dataBase.click();

		 
		test.log(LogStatus.PASS, "Database Checkbox is checked");
		}
		catch(Exception e)
		{

		 
		test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Database Checkbox is not checked");
		e.printStackTrace();
		}
	}
	public void checkFilterPublishContentIsDisplayed(ExtentTest test)
	{
		WebElement elementOnFilter1 = driver.findElement(By.xpath("//div[1]//div[2]//div[2]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		if(elementOnFilter1.isDisplayed())
		{
			if(elementOnFilter1.getText().equals("Publisher Content"))
			{
				 
				test.log(LogStatus.PASS, "Publisher Content is Displayed in filters");
			}
			else
			{

				 
				test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Publisher Content is Not Displayed");
			}
		}
	}
	public void checkForAllCurrentFilters(ExtentTest test)
	{
		WebElement elementOnFilter1 = driver.findElement(By.xpath("//div[1]//div[2]//div[2]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		WebElement elementOnFilter2 = driver.findElement(By.xpath("//div[1]//div[2]//div[2]/div[2]/div[1]/div[1]/div[2]/div[2]"));
		WebElement elementOnFilter3 = driver.findElement(By.xpath("//div[1]//div[2]//div[2]/div[2]/div[1]/div[1]/div[2]/div[3]"));
		
		if(elementOnFilter3.getText().equals("Publisher Content") && elementOnFilter2.getText().equals("Databases") && elementOnFilter1.getText().equals("Base Images"))
		{
			 
			test.log(LogStatus.PASS, "Base Image is Displayed as Filter 1");
			test.log(LogStatus.PASS, "Database is Displayed as Filter 2");
			test.log(LogStatus.PASS, "Publisher Content is Displayed as Filter 3");
			
		}
		else
		{
			 
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"Fileters are not dispalyed properly");
		}
	}
	public void cancelDataBaseFilter(ExtentTest test)
	{
		WebElement cancelDatabaseFilter = driver.findElement(By.xpath("//div[1]/div/div/div[2]//div[2]/div[2]/div[1]/div[1]/div[2]/div[text()='Databases']"));
		cancelDatabaseFilter.click();
		 
		test.log(LogStatus.PASS, "Database Filter is Cancelled");
	}
	public void checkDatabaseCheckBoxIsUnchecked(ExtentTest test)
	{
		if(!dataBase.isSelected()==true)
		{
			 
			test.log(LogStatus.PASS, "DataBase CheckBox is Unchecked !!");
		}
	}
}
