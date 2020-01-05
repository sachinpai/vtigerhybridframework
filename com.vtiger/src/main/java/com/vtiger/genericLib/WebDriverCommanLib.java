package com.vtiger.genericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vtiger.genericLib.BaseClass;

public class WebDriverCommanLib extends BaseClass{
	static String mainId;
	
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void moveToNavLink(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
	}
	
	public void navigateToChildWindow() {
		Set<String> allSessionId = BaseClass.driver.getWindowHandles();
		Iterator <String> it = allSessionId.iterator();
		mainId = it.next();
		String childId = it.next();
		BaseClass.driver.switchTo().window(childId);
	}
	
	public void navigateToMainWindow() {
		BaseClass.driver.switchTo().window(mainId);
	}
}
