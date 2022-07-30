package com.stepdefinition;

import java.io.IOException;

import com.pageobject.Menu2Page;
import com.pageobject.Menu5Page;
import com.reusablecomponents.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Menu5StepDefinition extends BrowserHelper{
	
	Menu5Page mp = new Menu5Page(driver);
	
	@Given("I have an Menu called Coupons and Rewards")
	public void i_have_an_menu_called_coupons_and_rewards() {
	    
	}

	@When("I click on Coupons and Rewards")
	public void i_click_on_coupons_and_rewards() {
		test = extent.createTest("Click on Coupons and Rewards");
		try {
			mp.clickMenu();
			test.pass("Clicked on Coupons and Rewards");
			log.info("Clicked on Coupons and Rewards");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("I click on Save Now")
	public void i_click_on_save_now() {
		test = extent.createTest("Click on Save Now");
		try {
			mp.clickOption();
			test.pass("Clicked on Save Now");
			log.info("Click on Save Now");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("on new Page Coupon will display")
	public void on_new_page_coupon_will_display() {
		test = extent.createTest("Verify Text");
		try {
			Boolean flag = mp.getText();
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
