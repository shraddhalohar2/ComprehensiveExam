package com.stepdefinition;

import java.io.IOException;

import com.pageobject.SpinnerPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpinnerBlockStepDefinition extends BrowserHelper{
	
	SpinnerPage sp = new SpinnerPage(driver);
	
	@Given("I have Stain Removal Guide")
	public void i_have_stain_removal_guide() {
	    
	}

	@When("I scroll for makeup")
	public void i_scroll_for_makeup() {
		test = extent.createTest("Scroll for makeup");
		try {
			sp.clickMenu();
			test.pass("Scrolled for makeup");
			log.info("Scrolled for makeup");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@And("I click on Learn More")
	public void i_click_on_learn_more() {
		test = extent.createTest("Click on Learn More");
		try {
			sp.clickbutton();
			test.pass("Clicked on Learn More");
			log.info("Click on Learn More");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("I verify the text")
	public void i_verify_the_text() {
		test = extent.createTest("Verify Text");
		try {
			Boolean flag = sp.getText();
			if(flag==true) {
				test.pass("Verification of the text Successfully");
				log.info("Verified text");
			}
			else {
				test.pass("Verification of the text Failed");
				log.error("Verification failed");
			}
			sp.closeiframe();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
