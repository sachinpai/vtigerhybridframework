package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInformationPage_Pom {

	@FindBy(xpath="//span[contains(text(),'Product Information')]")
	private WebElement SuccessMessText;

	public WebElement getSuccessMessWebElement() {
		return SuccessMessText;
	}
	
	public String getSuccessMess() {
		String message = SuccessMessText.getText();
		return message;
		
	}
}
