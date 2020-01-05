package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.vtiger.genericLib.BaseClass;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Script failed");
		String testName = result.getName();
		Date d = new Date();
		String dateString = d.toString();
		String date = dateString.replaceAll(" ", "").replaceAll(":", "_");
		EventFiringWebDriver web = new EventFiringWebDriver(BaseClass.driver);
		File scr = web.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+testName+date+".png");
		try {
			FileUtils.copyFile(scr, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
			
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
 
	public void onStart(ITestContext context) {
	}
	
	public void onFinish(ITestContext context) {
		
	}
}
