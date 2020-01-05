package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityInformationPage_Pom {
	@FindBy(xpath="//span[contains(text(),'Opportunity Information')]")
	private WebElement SuccessMessText;

	public WebElement getSuccessMessWebElement() {
		return SuccessMessText;
	}
	
	public String getSuccessMessText() {
		String message = SuccessMessText.getText();
		return message;
		
	}
}
