package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.Menu2UI;
import com.utilities.ScreenshotUtil;

public class Menu2Page extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public Menu2Page(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void hovering() throws Exception{
		help.actionHover(Menu2UI.hover);
	}
	
	public void clickOption() throws Exception{
		help.clickm(Menu2UI.option);
		help.clickm(Menu2UI.learnmore);
	}
	
	public Boolean verifyText() throws Exception{
		String urltext = help.getTextm(Menu2UI.text);
		cs.CaptureScreenShot();
		boolean flag = false;
		String str = ex.getstringdata("OptionMenu", 6, 1);
		if(urltext.contains(str))
		{
			flag = true;
			Assert.assertTrue(urltext.contains(str));
		}
		
		return flag;
	}
	
	public void iframeClose() throws Exception {
		help.waitm(Menu2UI.iframepop);
		help.clickm(Menu2UI.iframepop);
	}
}
