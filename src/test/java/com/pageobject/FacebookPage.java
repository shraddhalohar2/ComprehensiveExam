package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.FacebookUI;
import com.uistore.Menu1UI;
import com.utilities.ScreenshotUtil;

public class FacebookPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clicklink() throws Exception {
		help.clickm(FacebookUI.icon);
		cs.CaptureScreenShot();
	}
	
	public boolean getURL() throws Exception {
		boolean flag = false;
		String url = help.getUrl();
		String txt = ex.getstringdata("Facebook", 2, 1);
		if(url.equals(txt))
		{
			flag = true;
			Assert.assertEquals(url, txt);
			
		}
		return flag;
	}

}
