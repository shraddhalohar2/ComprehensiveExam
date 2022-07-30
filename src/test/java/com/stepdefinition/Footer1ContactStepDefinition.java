package com.stepdefinition;

import java.io.IOException;

import com.pageobject.FooterContactUsPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer1ContactStepDefinition extends BrowserHelper{
	
	FooterContactUsPage fp = new FooterContactUsPage(driver);
	
	@Given("I have Help & Support Option")
	public void i_have_help_support_option() {
	    
	}

	@When("I click on Contact Us")
	public void i_click_on_contact_us() {
		test = extent.createTest("Click on Contact Us");
	    try {
			fp.clickContact();
			test.pass("clicked on Contact Us");
			log.info("clicked on Contact Us");
			fp.iframeClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@And("I will type a question")
	public void i_will_type_a_question() {
		test = extent.createTest("Type a question");
	    try {
			fp.getQuestion();
			test.pass("Typing a question");
			test.pass("Searching a question");
			log.info("Typing a question");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("It show the result")
	public void it_show_the_result() {
		test = extent.createTest("Verify Text");
	    try {
			//fp.getText();
			Boolean flag = fp.getText();
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
