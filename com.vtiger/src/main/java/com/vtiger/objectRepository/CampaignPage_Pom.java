package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class CampaignPage_Pom {
	
	public CampaignPage_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement newCampaignIcon;
	
	@FindBy(name= "selected_id")
	private WebElement firstCampaign;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	//Getters Method
	
	public WebElement getNewCampaignIcon() {
		return newCampaignIcon;
	}
	
	public WebElement getFirstCampaign() {
		return firstCampaign;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}


	
	//Business Logic
	
	public void clickOnNewCampaign() {
		newCampaignIcon.click();
	}
	
	public void deleteFirstCampaign() {
		firstCampaign.click();
		deleteButton.click();
		BaseClass.driver.switchTo().alert().accept();
	}

}
