package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.reusablecomponents.BrowserHelper;

public class ScreenshotUtil extends BrowserHelper{
public void CaptureScreenShot() throws IOException {
	File src=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/"+getDatetime()+".png");
	try {
        FileHandler.copy(src, dest);

    } catch (IOException e) {
        System.out.println("unable to Capture ScreenShot");
    }
	    
	}
	public static String getDatetime() {

		DateFormat cusFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

		Date date=new Date();
		return	cusFormat.format(date);
	
	}
	
}
