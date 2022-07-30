package com.stepdefinition;

import java.io.IOException;

import com.pageobject.FooterCAPage;
import com.pageobject.FooterContactUsPage;
import com.pageobject.FooterIconPage;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterIconStepDefinition extends BrowserHelper{
	
	FooterIconPage fp = new FooterIconPage(driver);
	
	@Given("I have Tide Cleaner icon")
	public void i_have_tide_cleaner_icon() {
	    
	}

	@When("I click on Tide Cleaner icon")
	public void i_click_on_tide_cleaner_icon() {
		test = extent.createTest("Click on Tide Cleaner icon");
	    try {
			fp.clickIcon();
			test.pass("clicked on Tide Cleaner icon");
			log.info("clicked on Tide Cleaner icon");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("new window Tide Cleaner is open")
	public void new_window_tide_cleaner_is_open() {
	    
	}

	@Then("I choose Wedding dresses option")
	public void i_choose_wedding_dresses_option() {
		test = extent.createTest("Click on Wedding dresses option");
	    try {
			fp.clickoption();
			test.pass("clicked on Wedding dresses option");
			log.info("clicked on Wedding dresses option");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("I verifying the text")
	public void i_verifying_the_text() {
		test = extent.createTest("Verify Text");
	    try {
			//fp.getText();
			Boolean flag = fp.gettext();
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
