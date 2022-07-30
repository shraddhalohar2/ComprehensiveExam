package com.reusablecomponents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableHelper extends BrowserHelper{
	public void clickm(By element) throws Exception {
		try {
			driver.findElement(element).click();
		} catch (ElementNotInteractableException e) {
			throw new Exception(e);
		}
	}
	
	public void sendkeysm(By element, String text) throws Exception {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (ElementNotInteractableException e) {
			throw new Exception(e);
		}
	}
	
	public void keyboardm(By from) {
		driver.findElement(from).sendKeys(Keys.ENTER);	
	}
	
	public String getTextm(By element) {
		String str;
	    str=driver.findElement(element).getText();
		return str;
	}
	
	public String getTitlem()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void waitm(By element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void switchWindowm()
	{
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
			String newwin = it.next();
			driver.switchTo().window(newwin);
		}
	}
	
	public void scrollWindow(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy("+x+","+y+")", "");
	}
	
	public void actionHover(By element) {
		Actions a = new Actions(driver);
		WebElement shop = driver.findElement(element);
		a.moveToElement(shop).perform();
	}

	public String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void frame() {
		driver.switchTo().frame(0);
	}
}