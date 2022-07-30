package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.FooterCAUI;
import com.uistore.FooterContactUsUI;
import com.utilities.ScreenshotUtil;

public class FooterCAPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public FooterCAPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickCA() throws Exception {
		help.clickm(FooterCAUI.calink);
	}
	
	public void getHandle() {
		help.switchWindowm();
	}
	
	public boolean getText() throws Exception {
		boolean f = false;
		String link = ex.getstringdata("Footer0", 3, 1);
		String str = ex.getstringdata("Footer0", 2, 1);
		if(help.getTitlem().contains(link)) {
			String txt = help.getTextm(FooterCAUI.text);
			cs.CaptureScreenShot();
			if(txt.contains(str))
			{
				f = true;
				Assert.assertTrue(txt.contains(str));
			}
		}
		return f;
	}
	
	
}
