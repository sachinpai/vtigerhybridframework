package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuotePage_Pom {
	
	@FindBy(name="subject")
	private WebElement subjectField;
	
	@FindBy (id="jscal_field_validtill")
	private WebElement validTillField;
	
	@FindBy (name="carrier")
	private WebElement carrierDropDown;
	
	@FindBy (name="assigned_user_id1")
	private WebElement inventoryManagerDropDown;
	
	@FindBy (xpath="//input[@name='potential_name']/following-sibling::img")
	private WebElement opportunityNameWindowPopUpButton;
	
	@FindBy(name="quotestage")
	private WebElement quoteStageDropDown;
	
	@FindBy (xpath="//input[@name=\"contact_name\"]/following-sibling::img")
	private WebElement contactNameWindowPopUpButton;
	
	@FindBy (id="shipping")
	private WebElement shippingField;
	
	@FindBy (xpath="//input[@id=\"single_accountid\"]/following-sibling::img")
	private WebElement organizationNameWindowPopUpButton;
	
	@FindBy (name="description")
	private WebElement descriptionTextField;
	
	@FindBy (xpath="(//img[@title='Products'])[1]")
	private WebElement selectProductWindoPopupButton;
	
	@FindBy (xpath="//input[@class='detailedViewTextBoxOn']")
	private WebElement qtyField;
	
	@FindBy (xpath="//div[@class='discountUI']/../../preceding-sibling::tr/td/input")
	private WebElement listPriceField;
	
	@FindBy (xpath="//img[@title='Products']")
	private WebElement addProductButton;
	
	@FindBy (xpath="//input[@value='Add Service']")
	private WebElement addServiceButton;
	
	@FindBy (xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy (xpath="//input[@value='  Cancel  ']")
	private WebElement cancelButton;

	public WebElement getSubjectField() {
		return subjectField;
	}

	public WebElement getValidTillField() {
		return validTillField;
	}

	public WebElement getCarrierDropDown() {
		return carrierDropDown;
	}

	public WebElement getInventoryManagerDropDown() {
		return inventoryManagerDropDown;
	}

	public WebElement getOpportunityNameWindowPopUpButton() {
		return opportunityNameWindowPopUpButton;
	}

	public WebElement getQuoteStageDropDown() {
		return quoteStageDropDown;
	}

	public WebElement getContactNameWindowPopUpButton() {
		return contactNameWindowPopUpButton;
	}

	public WebElement getShippingField() {
		return shippingField;
	}

	public WebElement getOrganizationNameWindowPopUpButton() {
		return organizationNameWindowPopUpButton;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSelectProductWindoPopupButton() {
		return selectProductWindoPopupButton;
	}

	public WebElement getQtyField() {
		return qtyField;
	}

	public WebElement getListPriceField() {
		return listPriceField;
	}

	public WebElement getAddProductButton() {
		return addProductButton;
	}

	public WebElement getAddServiceButton() {
		return addServiceButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	//Business Logic
	
	public void opportunityNameWindowPopUpButtonClick(){
		opportunityNameWindowPopUpButton.click();
	}
	
	public void contactNameWindowPopUpButtonClick(){
		contactNameWindowPopUpButton.click();
	}
	
	public void organizationNameWindowPopUpButtonClick(){
		organizationNameWindowPopUpButton.click();
	}
	
	public void saveButtonClick(){
		saveButton.click();
	}
	
	public void cancelButtonClick(){
		cancelButton.click();
	}

}
