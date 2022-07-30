package com.stepdefinition;

import java.io.IOException;

import com.pageobject.FooterCAPage;
import com.pageobject.FooterContactUsPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterCAStepDefinition extends BrowserHelper{
	
	FooterCAPage fp = new FooterCAPage(driver);
	@Given("I have CA Privacy Option")
	public void i_have_ca_privacy_option() {
	    
	}

	@When("I click on CA Privacy link")
	public void i_click_on_ca_privacy_link() {
		test = extent.createTest("Click on CA Privacy link");
	    try {
			fp.clickCA();
			test.pass("clicked on CA Privacy link");
			log.info("clicked on CA Privacy link");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("new window with P&G link will open")
	public void new_window_with_p_g_link_will_open() {
		test = extent.createTest("New window with P&G");
		fp.getHandle();
		test.pass("New window with P&G is opened");
		log.info("New window with P&G is opened");
	}

	@Then("I have to verify with text")
	public void i_have_to_verify_with_text() {
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
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
