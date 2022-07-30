package com.pageobject;

import org.openqa.selenium.WebDriver;

import com.reusablecomponents.BrowserHelper;
import com.reusablecomponents.ReusableHelper;
import com.uistore.SignupUI;
import com.utilities.ScreenshotUtil;

public class SignupPage extends BrowserHelper{
	ScreenshotUtil cs = new ScreenshotUtil();
	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ReusableHelper help = new ReusableHelper();
	
	public void registerf() throws Exception {
		help.clickm(SignupUI.registerbutton);
	}
	
	public void iframef() throws Exception {
		help.waitm(SignupUI.iframepop);
		help.clickm(SignupUI.iframepop);
	}
	
	public void signupf() throws Exception{
		help.clickm(SignupUI.signupbutton);
	}
	
	public void newwindowf() throws Exception
	{
		help.switchWindowm();
		String exstr = ex.getstringdata("Signup", 2, 1);
		String name = ex.getstringdata("Signup", 3, 1);
		String mail = ex.getstringdata("Signup", 4, 1);
		String pass = ex.getstringdata("Signup", 5, 1);
		String title = help.getTitlem();
		if(title.contains(exstr)) {
			help.clickm(SignupUI.entername);
			help.sendkeysm(SignupUI.entername, name);
			help.clickm(SignupUI.enteremail);
			help.sendkeysm(SignupUI.enteremail, mail);
			help.clickm(SignupUI.enterpassword);
			help.sendkeysm(SignupUI.enterpassword, pass);
			help.waitm(SignupUI.submit);
			help.clickm(SignupUI.submit);
			Thread.sleep(3000);
		}
		cs.CaptureScreenShot();
	}
	
}
