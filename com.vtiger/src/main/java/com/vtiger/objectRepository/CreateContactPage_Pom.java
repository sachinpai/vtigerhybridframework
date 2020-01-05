package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactPage_Pom {
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement firstNameGenderDropDownField;
	
	@FindBy(name="firstname")
	private WebElement firstNameField;
	
	@FindBy(name="lastname")
	private WebElement lastNameField;

	@FindBy(xpath="//input[@name='account_id']/../img")
	private WebElement organizationNameSelectWindow;

	@FindBy(name="leadsource")
	private WebElement leadSourceDropDownField;

	@FindBy(id="title")
	private WebElement titleField;

	@FindBy(id="department")
	private WebElement departmentField;

	@FindBy(id="email")
	private WebElement emailField;

	@FindBy(id="assistant")
	private WebElement assistantField;

	@FindBy(id="secondaryemail")
	private WebElement secondaryEmailField;

	@FindBy(name="donotcall")
	private WebElement doNotCallCheckboxField;

	@FindBy(id="phone")
	private WebElement officePhoneField;

	@FindBy(id="mobile")
	private WebElement mobileField;

	@FindBy(id="homephone")
	private WebElement homePhoneField;

	@FindBy(id="otherphone")
	private WebElement otherPhoneField;

	@FindBy(id="fax")
	private WebElement faxField;

	@FindBy(id="jscal_field_birthday")
	private WebElement birthdateField;

	@FindBy(id="assistantphone")
	private WebElement assistantPhoneField;

	@FindBy(name="emailoptout")
	private WebElement emailOptOutCheckBoxField;

	@FindBy(name="reference")
	private WebElement referenceCheckBoxField;

	@FindBy(name="notify_owner")
	private WebElement notifyOwnerCheckBoxField;

	@FindBy(name="description")
	private WebElement descriptionTextField;
	
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@value='  Cancel  ']")
	private WebElement cancelButton;
	
	//getters

	public WebElement getFirstNameGenderDropDownField() {
		return firstNameGenderDropDownField;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getOrganizationNameSelectWindow() {
		return organizationNameSelectWindow;
	}

	public WebElement getLeadSourceDropDownField() {
		return leadSourceDropDownField;
	}

	public WebElement getTitleField() {
		return titleField;
	}

	public WebElement getDepartmentField() {
		return departmentField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getAssistantField() {
		return assistantField;
	}

	public WebElement getSecondaryEmailField() {
		return secondaryEmailField;
	}

	public WebElement getDoNotCallCheckboxField() {
		return doNotCallCheckboxField;
	}

	public WebElement getOfficePhoneField() {
		return officePhoneField;
	}

	public WebElement getMobileField() {
		return mobileField;
	}

	public WebElement getHomePhoneField() {
		return homePhoneField;
	}

	public WebElement getOtherPhoneField() {
		return otherPhoneField;
	}

	public WebElement getFaxField() {
		return faxField;
	}

	public WebElement getBirthdateField() {
		return birthdateField;
	}

	public WebElement getAssistantPhoneField() {
		return assistantPhoneField;
	}

	public WebElement getEmailOptOutCheckBoxField() {
		return emailOptOutCheckBoxField;
	}

	public WebElement getReferenceCheckBoxField() {
		return referenceCheckBoxField;
	}

	public WebElement getNotifyOwnerCheckBoxField() {
		return notifyOwnerCheckBoxField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	// Business Logic
	
	public void clickOrganizationIcon() {
		organizationNameSelectWindow.click();
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}

}
