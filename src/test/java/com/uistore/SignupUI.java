package com.uistore;

import org.openqa.selenium.By;

public class SignupUI {

	public static By registerbutton = By.className("login-register");
	
	public static By iframepop = By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']");
	
	public static By signupbutton = By.xpath("//a[@class='event_internal_link']");
	
	public static By entername = By.id("name");
	
	public static By enteremail = By.cssSelector("input[id='email']");
	
	public static By enterpassword = By.cssSelector("input[id='password']");
	
	public static By submit = By.cssSelector("input[type='submit']");
	
}
