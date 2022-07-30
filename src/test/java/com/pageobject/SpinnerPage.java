package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.Menu2UI;
import com.uistore.Menu5UI;
import com.uistore.SpinnerUI;
import com.utilities.ScreenshotUtil;

public class SpinnerPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public SpinnerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickMenu() throws Exception{
		help.clickm(SpinnerUI.spinobj);
		help.clickm(SpinnerUI.spinobj);
	}
	
	public void clickbutton() throws Exception {
		help.clickm(SpinnerUI.button);
	}
	
	public Boolean getText() throws IOException {
		Boolean flag = false;
		String str = ex.getstringdata("SpinnerBlock", 2, 1);
		String txt = help.getTextm(SpinnerUI.text);
		cs.CaptureScreenShot();
		if(txt.contains(str)) {
			flag = true;
			Assert.assertTrue(txt.contains(str));
		}
		return flag;
	}
	
	public void closeiframe() {
		help.waitm(SpinnerUI.iframepop);
		try {
			help.clickm(SpinnerUI.iframepop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
