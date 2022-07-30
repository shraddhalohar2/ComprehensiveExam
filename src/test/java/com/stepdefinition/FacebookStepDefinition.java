package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.FacebookPage;
import com.pageobject.SpinnerPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDefinition extends BrowserHelper{
	@Before
	public void connect() throws IOException {
		driver=initializing();
		ExtentTest test = extent.createTest("Browser Connect");
		test.pass("Initializing Browser");
		log.info("Started chrome browser");
		test.pass("Chrome Driver Started");
		test.pass("Fetched Tide URL and getting home page");
		log.info("Fetched Tide url");
	}
	
	@After
	public void closer() {
		ExtentTest test = extent.createTest("Closing All Drivers and Browsing Windows");
		log.info("Closed browser");
		log.info("Finished Extent Report");
		test.pass("Chrome Browser closed");
		test.pass("Chrome Driver Closed");
		extent.flush();
		//driver.close();
		driver.quit();
	}
	FacebookPage fp = new FacebookPage(driver);
	
	@Given("I have option {string}")
	public void i_have_option(String string) {
	    
	}

	@When("I click on facebook icon")
	public void i_click_on_facebook_icon() {
		test = extent.createTest("Click on facebook icon");
		try {
			fp.clicklink();;
			test.pass("clicked on facebook icon");
			log.info("clicked on facebook icon");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("It should open Facebook link")
	public void it_should_open_facebook_link() throws Exception {
		test = extent.createTest("Verify Text");
		try {
			Boolean flag = fp.getURL();
			if(flag==true) {
				test.pass("Verification of the text Successfully");
				log.info("Verified text");
			}
			else {
				test.pass("Verification of the text Failed");
				log.error("Verification failed");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
