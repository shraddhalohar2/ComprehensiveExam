package com.uistore;

import org.openqa.selenium.By;

public class SearchUI {
	
	public static By searchbutton = By.xpath("//input[@name='q']");
	
	public static By iframepop = By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']");
	
	public static By closepopup = By.xpath("//button[@class='sticker_close']");
	
	public static By clicklist = By.xpath("//button[contains(text(),'Products')]");
	
	public static By productpreview = By.xpath("//a[@class='product-preview-title']//strong[contains(text(),'Free and Gentle')]");
	
	public static By selectproduct = By.xpath("//div[@itemprop='name']//h1");
	
	public static By retailer = By.xpath("//span[contains(text(),'Find Retailers')]");
	
}
