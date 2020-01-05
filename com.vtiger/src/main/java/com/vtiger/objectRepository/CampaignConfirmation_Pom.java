package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignConfirmation_Pom {
	
	public CampaignConfirmation_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy( xpath = "//span[contains(text(),'Campaign Information')]" )
	private WebElement confirmationMessage;
	
	//Getters Method
	
	public WebElement getConfirmationMessageElement() {
		return confirmationMessage;
	}
	
	//Business Logic
	
	public String getConfirmationMessage() {
		return confirmationMessage.getText();
	}

}
