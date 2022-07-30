package com.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.Menu1UI;
import com.utilities.ScreenshotUtil;

public class Menu1Page extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public Menu1Page(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void hoverMenu() throws Exception {
		help.actionHover(Menu1UI.hover);
	}
	
	public void findoption() throws Exception {
		help.clickm(Menu1UI.option);
	}
	
	public void iframeclose() throws Exception {
		help.waitm(Menu1UI.iframepop);
		help.clickm(Menu1UI.iframepop);
	}
	
	public boolean verifyText() throws Exception {
		boolean flag = false;
		String fromurl = help.getTextm(Menu1UI.textselect);
		String text = ex.getstringdata("OptionMenu", 2, 1);
		if(fromurl.contains(text))
		{
			Assert.assertTrue(fromurl.contains(text));
			flag=true;
		}
		cs.CaptureScreenShot();
		return flag;
	}
}
