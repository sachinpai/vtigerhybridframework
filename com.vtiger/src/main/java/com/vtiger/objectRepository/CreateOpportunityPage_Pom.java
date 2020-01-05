package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOpportunityPage_Pom {
	
	@FindBy(name="potentialname")
	private WebElement opportunityNameField;
	
	@FindBy (id="related_to_type")
	private WebElement relatedToDropDownField;
	
	@FindBy (xpath="//input[@id='related_to_display']/following-sibling::img")
	private WebElement relatedToIconButton;
	
	@FindBy (name="opportunity_type")
	private WebElement typeDropDownField;
	
	@FindBy (name="leadsource")
	private WebElement leadSourceDropDownField;
	
	@FindBy (xpath="//input[@name='campaignid']/following-sibling::img")
	private WebElement campaignSourceWindowIconButton;
	
	@FindBy (name="amount")
	private WebElement amountField;
	
	@FindBy (id="jscal_field_closingdate")
	private WebElement expectedCloseDateField;
	
	@FindBy (id="nextstep")
	private WebElement nextStepField;
	
	@FindBy (name="sales_stage")
	private WebElement salesStageDropDownField;
	
	@FindBy (id="probability")
	private WebElement probabilityField;
	
	@FindBy (name="description")
	private WebElement descriptionTextBoxField;
	
	@FindBy (xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy (xpath = "(//input[@value='  Cancel  '])[1]")
	private WebElement cancelButton;

	public WebElement getOpportunityNameField() {
		return opportunityNameField;
	}

	public WebElement getRelatedToDropDownField() {
		return relatedToDropDownField;
	}

	public WebElement getRelatedToIconButton() {
		return relatedToIconButton;
	}

	public WebElement getTypeDropDownField() {
		return typeDropDownField;
	}

	public WebElement getLeadSourceDropDownField() {
		return leadSourceDropDownField;
	}

	public WebElement getCampaignSourceWindowIconButton() {
		return campaignSourceWindowIconButton;
	}

	public WebElement getAmountField() {
		return amountField;
	}

	public WebElement getExpectedCloseDateField() {
		return expectedCloseDateField;
	}

	public WebElement getnextStepField() {
		return nextStepField;
	}

	public WebElement getSalesStageDropDownField() {
		return salesStageDropDownField;
	}

	public WebElement getProbabilityField() {
		return probabilityField;
	}

	public WebElement getDescriptionTextBoxField() {
		return descriptionTextBoxField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	// Business Logic
	
	public void relatedToIconClick() {
		relatedToIconButton.click();
	}
	
	public void campaignSourceIconClick() {
		campaignSourceWindowIconButton.click();
	}
	
	public void saveButton() {
		saveButton.click();
	}
	
	public void CancelButton() {
		cancelButton.click();
	}


}
