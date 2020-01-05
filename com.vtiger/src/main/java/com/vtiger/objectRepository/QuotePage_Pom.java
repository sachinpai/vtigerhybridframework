package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage_Pom {
	
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement CreateNewQuoteButton;
	
	@FindBy(name="search_text")
	private WebElement searchTextField;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	private WebElement searchButton;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchIn;
	
	//getters
	
	public WebElement getCreateContactIcon() {
		return CreateNewQuoteButton;
	}
	
	
	public WebElement getsearchButton() {
		return searchButton;
	}
	
	public WebElement getCreateNewQuoteButton() {
		return CreateNewQuoteButton;
	}


	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	public WebElement getsearchIn(){
		return searchIn;
	}
	
	//Business logic
	
	public void ClickNewQuoteButton() {
		CreateNewQuoteButton.click();
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
}
