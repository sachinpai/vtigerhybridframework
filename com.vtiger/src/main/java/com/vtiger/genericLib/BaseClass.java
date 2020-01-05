package com.vtiger.genericLib;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.vtiger.genericLib.FileLib;
import com.vtiger.genericLib.WebDriverCommanLib;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.Login_Pom;


@Listeners (com.vtiger.genericLib.Listeners.class)
public class BaseClass {
	
	public static WebDriver driver = null;
	public FileLib f = new FileLib();
	public static WebDriverCommanLib commanFun = new WebDriverCommanLib();
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = f.FetchPropertyFileData("vtigerurl");
		driver.get(url);			
	}
	
	@BeforeMethod 
	public void loginIntoVtiger() throws IOException {
		Login_Pom l = PageFactory.initElements(driver, Login_Pom.class);
		String username = f.FetchPropertyFileData("vtigerusername");
		String pass = f.FetchPropertyFileData("vtigerpassword");
		l.loginToApplication(username, pass);
	}
	
	@AfterMethod 
	public void logoutFromVtiger() throws InterruptedException {
		HomePage_Pom logout = PageFactory.initElements(driver, HomePage_Pom.class);
		logout.ClickLogout();
	}
	
	@AfterClass 
	public void closeBrowser() {
		driver.close();
	}

}
