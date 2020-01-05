package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteInformationPage {
	@FindBy(xpath="//span[contains(text(),'Quote Information')]")
	private WebElement SuccessMessText;
	
	@FindBy(name="Duplicate")
	private WebElement duplicateButton;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	private WebElement searchButton;
	
	@FindBy(linkText="Quotes")
	private WebElement quotespage;
	
	// Getters
	
	public WebElement getQuotesPage() {
		return quotespage;
	}
	
	public WebElement getSuccessMessText() {
		return SuccessMessText;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}
	
	public WebElement getsearchButton() {
		return searchButton;
	}

	public WebElement getSuccessMessWebElement() {
		return SuccessMessText;
	}
	
	//Business Logic
	
	public String getSuccessMess() {
		String message = SuccessMessText.getText();
		return message;
	}
	
	public void clickDuplicateButton() {
		duplicateButton.click();
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void ClickQuotesLink() {
		quotespage.click();
	}
	
	
}
