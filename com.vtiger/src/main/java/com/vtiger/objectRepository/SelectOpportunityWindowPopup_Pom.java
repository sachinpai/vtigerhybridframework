package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectOpportunityWindowPopup_Pom {
	@FindBy(id="search_txt")
	private WebElement searchField;
	
	@FindBy(name="search")
	private WebElement searchNowButton;
	
	@FindBy(xpath="//a[@class='listFormHeaderLinks']/../../following-sibling::tr/td/a")
	private WebElement firstSearchResult;

	//Getters
	
	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getFirstSearchResult() {
		return firstSearchResult;
	}
	
	// Business Logic

	public void searchButtonClick() {
		searchNowButton.click();
	}
	
	public void firstSearchResultClick() {
		firstSearchResult.click();
	}
}
