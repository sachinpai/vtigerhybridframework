package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityPage_Pom {
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createNewOpportunityIcon;

	public WebElement getCreateNewOpportunityIcon() {
		return createNewOpportunityIcon;
	}
	
	public void createNewOpportunityIconClick() {
		createNewOpportunityIcon.click();
	}
}
