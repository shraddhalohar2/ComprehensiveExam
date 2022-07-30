package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.Menu5UI;
import com.utilities.ScreenshotUtil;

public class Menu5Page extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public Menu5Page(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void clickMenu() throws Exception{
		help.clickm(Menu5UI.clickmenu);
	}
	
	public void clickOption() throws Exception{
		help.clickm(Menu5UI.option);
	}
	
	public Boolean getText() throws IOException {
		Boolean flag = false;
		help.switchWindowm();
		String str = ex.getstringdata("Signup", 2, 1);
		String s1 = ex.getstringdata("OptionMenu", 10, 1);
		if(help.getTitlem().contains(str)) {
			String text  = help.getTextm(Menu5UI.text);
			cs.CaptureScreenShot();
			if(text.contains(s1))
			{
				flag=true;
				Assert.assertTrue(text.contains(s1));
			}
			
		}
		return flag;
	}
}
