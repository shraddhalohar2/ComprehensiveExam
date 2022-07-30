package com.uistore;

import org.openqa.selenium.By;

public class FooterContactUsUI {
	
	public static By contact = By.xpath("//a[@class='event_menu_click']//span[contains(text(),'Contact')]");
	
	public static By iframepop = By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']");
	
	public static By question = By.xpath("//input[@placeholder='Type here to search for answers']");
	
	public static By clickques = By.xpath("//a[contains(text(),'Which Tide detergents can I use in my HE washer?')]");
	
	public static By text = By.xpath("//div[@class='articleContent']//following-sibling::li[1]");
	
}
