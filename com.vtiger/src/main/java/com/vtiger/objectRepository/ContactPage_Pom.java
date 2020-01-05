package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage_Pom {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateContactIcon;

	public WebElement getCreateContactIcon() {
		return CreateContactIcon;
	}
	
	public void clickCreateContactIcon() {
		CreateContactIcon.click();
	}

}
