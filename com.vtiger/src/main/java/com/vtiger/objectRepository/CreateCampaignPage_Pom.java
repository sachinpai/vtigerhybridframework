package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage_Pom {
	
	public CreateCampaignPage_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "campaignname")
	private WebElement campaignNameField;
	
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	private WebElement saveButton;
	
	//Getters Method
	
	public WebElement getCampaignNameField() {
		return campaignNameField;		
	}
	
	public WebElement getSaveButton() {
		return saveButton;		
	}	
	
	//Business Logic
	
	public void fillCampaignNameField(String campaignName) {
		campaignNameField.sendKeys(campaignName);
	}
	
	public void clickSave() {
		saveButton.click();
	}
}
