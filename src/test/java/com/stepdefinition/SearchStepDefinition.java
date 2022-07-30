package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.SearchPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition extends BrowserHelper{
	
//	@Before
//	public void connect() throws IOException {
//		driver=initializing();
//		ExtentTest test = extent.createTest("Browser Connect");
//		test.pass("Initializing Browser");
//		log.info("Started chrome browser");
//		test.pass("Chrome Driver Started");
//		test.pass("Fetched Tide URL and getting home page");
//		log.info("Fetched Tide url");
//	}
//	
//	@After
//	public void closer() {
//		ExtentTest test = extent.createTest("Closing All Drivers and Browsing Windows");
//		log.info("Closed browser");
//		log.info("Finished Extent Report");
//		test.pass("Chrome Browser closed");
//		test.pass("Chrome Driver Closed");
//		extent.flush();
//		//driver.close();
//		driver.quit();
//	}
	
	SearchPage sp = new SearchPage(driver);
	//ExtentTest test;
	
	@Given("I have Search button on Tide Homepage")
	public void i_have_search_button_on_tide_homepage() {
	    // Write code here that turns the phrase above into concrete actions
				
		test = extent.createTest("Click on Search Button");
		test.pass("Clicked on Search Button");
	}

	@When("I have searched a product")
	public void i_have_searched_a_product() {
	    // Write code here that turns the phrase above into concrete actions
		test = extent.createTest("Search Product");
		try {
			sp.clickSearch();
			sp.iframeclose();
			sp.popupClose();
			
			log.info("Searched a Product");
			test.pass("Searched a Product");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	@And("List of products appered")
	public void list_of_products_appered() {
	    // Write code here that turns the phrase above into concrete actions
		test = extent.createTest("List of Products");
		test.pass("List of Products displayed");
		log.info("List of Products displayed");
	}

	@And("I clicked one product")
	public void i_clicked_one_product() {
	    // Write code here that turns the phrase above into concrete actions
		test = extent.createTest("Select a Product");
		try {
			sp.clickProduct();
			test.pass("Product selected");
			log.info("Product selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("I have find retailers")
	public void i_have_find_retailers() {
	    // Write code here that turns the phrase above into concrete actions
		test = extent.createTest("Finding Retailers");
	    try {
			sp.getProductText();
			sp.getRetailers();
			test.pass("Retailers found");
			log.info("Retailers found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
