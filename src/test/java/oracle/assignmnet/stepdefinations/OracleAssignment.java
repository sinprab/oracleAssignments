package oracle.assignmnet.stepdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import oracle.assignmnet.driverFactory.DriverManager;
import oracle.assignmnet.pages.ContainersPage;
import oracle.assignmnet.reporting.ScreenCapture;

public class OracleAssignment extends DriverManager{
	
	ContainersPage containerpage;
	ExtentReports reports;
	ExtentTest test;
	
	
	@Given("User Opens Docker Hub Search Page")
	public void user_opens_docker_hub_search_page() {
		
		
		reports = new ExtentReports("target/extentReports.html", true);
		test = reports.startTest("Oracle Assignment 1");
		
		DriverManager.setDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try
		{
		driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        test.log(LogStatus.PASS, "User launched Docker Hub Search Page");
		}
		catch(Exception e)
		{
		test.log(LogStatus.FAIL, test.addScreenCapture(ScreenCapture.capture(driver))+"User Failed to launch Docker Hub Search Page");
		reports.endTest(test);
		reports.close();
		}
		
        
	   
	}

	
	

	@Then("user lands in the Containers tab by default")
	public void user_lands_in_the_containers_tab_by_default() {
		
		containerpage= new ContainersPage();
		containerpage.verifyLandingTab(test);
	}

	
	@Then("there are two checkboxes under Images")
	public void there_are_two_checkboxes_under_images(List<List<String>> dataTable) {
	    
	    
	    for(List<String> list : dataTable)
	    {
	    	for(String str : list)
	    	{
	    		switch(str)
	    		{
	    		case "Verified Publisher" 	: 	containerpage.isVerifiedPublisherACheckBox(test);
	    										break;
	    		case "Offcial Images" 		: 	containerpage.isOfficialImageACheckBox(test);
												break;		
				default						: 	System.out.println("Undefined Choice For Images");
	    		}
	    	}
	    }
	}

	
	@Then("under Categories following checkboxes are present")
	public void under_categories_following_checkboxes_are_present(List<List<String>> dataTable) {
		
		for(List<String> list : dataTable)
	    {
	    	for(String str : list)
	    	{
	    		switch(str)
	    		{
	    		case "Analytics" 		: 	containerpage.isAnalyticsACheckBox(test);
	    									break;
	    		case "Base Images" 		: 	containerpage.isBaseImageACheckBox(test);
											break;	
	    		case "Databases" 		: 	containerpage.isDataBaseACheckBox(test);
											break;
	    		case "Storage" 			: 	containerpage.isStorageACheckBox(test);
											break;
				default					: 	System.out.println("Undefined Choice For Categories");
	    		}
	    	}
	    }
	    
	}

		@When("user clicks the Verified Publisher checkbox")
	public void user_clicks_the_verified_publisher_checkbox() {
			
			containerpage.clickVerifedPublisherCheckbox(test);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	
	@Then("filter Publisher Content is shown at the top of the content")
	public void filter_publisher_content_is_shown_at_the_top_of_the_content() {
		
		containerpage.checkFilterPublishContentIsDisplayed(test);
	    
	}

	
	@When("user clicks Base Images checkbox")
	public void user_clicks_base_images_checkbox() {
		
		containerpage.clickBaseImageCheckbox(test);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   
	}

	
	@When("user clicks Database checkbox")
	public void user_clicks_database_checkbox() {
		
		containerpage.clickDataBaseCheckbox(test);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	
	@Then("additional filters are shown at the top of the content")
	public void additional_filters_are_shown_at_the_top_of_the_content() {
		
		containerpage.checkForAllCurrentFilters(test);
	    
	}

	
	@When("user clicks the close icon of the database filters")
	public void user_clicks_the_close_icon_of_the_database_filters() {
		
		containerpage.cancelDataBaseFilter(test);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	
	@Then("corresponding checkbox in the left filter pane is also unchecked")
	public void corresponding_checkbox_in_the_left_filter_pane_is_also_unchecked() {
		
		containerpage.checkDatabaseCheckBoxIsUnchecked(test);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		reports.endTest(test);
		reports.close();
	    
	}


}
