package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.SearchUI;
import com.utilities.ScreenshotUtil;

public class SearchPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickSearch() throws Exception {
		help.clickm(SearchUI.searchbutton);
		String prod = ex.getstringdata("Search", 2, 1);
		help.sendkeysm(SearchUI.searchbutton, prod);
		help.keyboardm(SearchUI.searchbutton);
	}
	
	public void iframeclose() throws Exception {
		help.waitm(SearchUI.iframepop);
		help.clickm(SearchUI.iframepop);
	}
	
	public void popupClose() throws Exception {
		help.scrollWindow(0, 150);
		help.clickm(SearchUI.closepopup);
		help.clickm(SearchUI.clicklist);
	}
	
	public void clickProduct() throws Exception {
		help.clickm(SearchUI.productpreview);
	}
	
	public void getProductText() throws Exception {
		String text = help.getTextm(SearchUI.selectproduct);
		String msg = ex.getstringdata("Search", 3, 1);
		if(text.contains(msg))
		{
			Assert.assertTrue(text.contains(msg));
		}
		
	}
	
	public void getRetailers() throws Exception{
		help.clickm(SearchUI.retailer);
		Thread.sleep(3000);
		cs.CaptureScreenShot();
	}
}
