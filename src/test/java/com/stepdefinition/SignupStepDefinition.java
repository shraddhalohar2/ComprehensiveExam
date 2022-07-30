package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.SignupPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepDefinition extends BrowserHelper{
	
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
	
	SignupPage sp = new SignupPage(driver);
	//ExtentTest test;
	
	@Given("I have Register button on Tide Homepage")
	public void i_have_register_button_on_tide_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I clicked on register button")
	public void i_clicked_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			sp.registerf();
			sp.iframef();
			log.info("Clicked on Register Button");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		test = extent.createTest("Clicked on Register Button");
		test.pass("Clicked on Register Button");
	}

	@And("I clicked on Signup now button")
	public void i_clicked_on_signup_now_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			sp.signupf();
			log.info("Clicked on Signup Button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test = extent.createTest("Clicked on Signup now Button");
		test.pass("Clicked on Signup now Button");
	}

	@And("I will insert name, email, password")
	public void i_will_insert_name_email_password() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			sp.newwindowf();
			log.info("Name, email and password Inserted Successfully");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		test = extent.createTest("Name, email and password Inserted Successfully");
		test.pass("Entered Valid Name");
		test.pass("Entered Valid Email Address");
		test.pass("Entered Valid Password");
		test.pass("Clicked on Create Account Button");
	}

	@Then("click on create account")
	public void click_on_create_account() {
	    // Write code here that turns the phrase above into concrete actions
		log.info("Signup Successfully done");
		test = extent.createTest("Signup Finished");
		test.pass("Sign Up successful");
	}


}
