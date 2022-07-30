package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.FooterContactUsUI;
import com.utilities.ScreenshotUtil;

public class FooterContactUsPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public FooterContactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickContact() throws Exception {
		help.clickm(FooterContactUsUI.contact);
	}
	
	public void iframeClose() throws Exception {
		help.waitm(FooterContactUsUI.iframepop);
		help.clickm(FooterContactUsUI.iframepop);
	}
	
	public void getQuestion() throws Exception {
		help.frame();
		Thread.sleep(5000);
		help.clickm(FooterContactUsUI.question);
		String q = ex.getstringdata("Footer1", 2, 1);
		help.sendkeysm(FooterContactUsUI.question, q);
		help.keyboardm(FooterContactUsUI.question);
		help.clickm(FooterContactUsUI.clickques);
	}
	
	public boolean getText() throws IOException {
		boolean f = false;
		String txt = help.getTextm(FooterContactUsUI.text);
		cs.CaptureScreenShot();
		String str = ex.getstringdata("Footer1", 3, 1);
		if(txt.contains(str))
		{
			f = true;
			Assert.assertTrue(txt.contains(str));
		}
		return f;
	}
	

}
