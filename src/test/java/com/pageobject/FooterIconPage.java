package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.FooterCAUI;
import com.uistore.FooterIconUI;
import com.utilities.ScreenshotUtil;

public class FooterIconPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public FooterIconPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickIcon() throws Exception {
		help.clickm(FooterIconUI.icon);
	}
	
	public void clickoption() throws Exception {
		Thread.sleep(2000);
		help.clickm(FooterIconUI.clickOption);
	}

	public boolean gettext() throws IOException {
		boolean f = false;
		String str = ex.getstringdata("Footer2", 2, 1);
		
			String txt = help.getTextm(FooterIconUI.text);
			cs.CaptureScreenShot();
			if(txt.contains(str))
			{
				f = true;
				Assert.assertTrue(txt.contains(str));
			}
		
		return f;
	}
}
