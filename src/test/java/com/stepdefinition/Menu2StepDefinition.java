package com.stepdefinition;

import com.pageobject.Menu2Page;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Menu2StepDefinition extends BrowserHelper{
	Menu2Page mp = new Menu2Page(driver);
	
	
	@Given("I have an Menu called Our Commitment")
	public void i_have_an_menu_called_our_commitment() {
	   
	}

	@When("I hover on Our Commitment")
	public void i_hover_on_our_commitment() {
		 test = extent.createTest("Hover on Our Commitment Menu");
		 try {
			mp.hovering();
			test.pass("Hovering on Our Commitment Menu");
			log.info("Hovering on Menu Our Commitment");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("I clicked on America's #{int} Detergent")
	public void i_clicked_on_america_s_detergent(Integer int1) {
		test = extent.createTest("Click on Option");
	    try {
			mp.clickOption();
			test.pass("Clicked on America's #"+int1+" detergent Option");
			log.warn("Clicked on America's #"+int1+" detergent Option");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("I have to check the text to verify for menu2")
	public void i_have_to_check_the_text_to_verify_for_menu2() {
		test = extent.createTest("Verify Text");
		try {
			Boolean flag = mp.verifyText();
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
