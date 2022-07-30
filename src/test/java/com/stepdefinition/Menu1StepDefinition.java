package com.stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.Menu1Page;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Menu1StepDefinition extends BrowserHelper{
	
	Menu1Page mp = new Menu1Page(driver);
	//ExtentTest test;
	
	@Given("I have a Shop Product Menu")
	public void i_have_a_shop_product_menu() {
	    
	}

	@When("I hover on Shop Product")
	public void i_hover_on_shop_product() {
		test = extent.createTest("Hover on Shop Product");
		try {
			mp.hoverMenu();
			test.pass("Hovering on Shop Product");
			log.warn("Hovering on Shop Product");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("I clicked on Machine care")
	public void i_clicked_on_machine_care() {
	   test = extent.createTest("Click on Option Machine Care");
	   try {
		mp.findoption();
		mp.iframeclose();
		test.pass("Clicked on Machine Care Option");
		log.info("Clicked on Machine Care Option");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}

	@Then("I have to check the text to verify")
	public void i_have_to_check_the_text_to_verify() {
	    test = extent.createTest("Verify the text");
	    try {
			boolean flag = mp.verifyText();
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
