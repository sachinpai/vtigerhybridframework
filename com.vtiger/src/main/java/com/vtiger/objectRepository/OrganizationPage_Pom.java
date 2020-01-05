package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class OrganizationPage_Pom extends BaseClass{
	
	public OrganizationPage_Pom (){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;
	
	// Getters
	
	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}
	
	// Business Logic
	
	public void clickCreateOrganizationButton() {
		createOrganizationButton.click();
	}

}
