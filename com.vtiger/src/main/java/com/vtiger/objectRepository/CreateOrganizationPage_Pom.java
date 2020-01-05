package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrganizationPage_Pom {
	
	@FindBy(name= "accountname")
	private WebElement organizationNameField;
	
	@FindBy(name= "website")
	private WebElement websiteField;
	
	@FindBy(name= "fax")
	private WebElement faxField;
	
	@FindBy(name= "employees")
	private WebElement employeesField;
	
	@FindBy(name= "email2")
	private WebElement otherEmailField;
	
	@FindBy(name="industry")
	private WebElement industryField;
	
	@FindBy(name="emailoptout")
	private WebElement EmailOptOutField;
	
	@FindBy(name="notify_owner")
	private WebElement notifyOwnerField;
	
	@FindBy(name="phone")
	private WebElement PhoneField;
	
	@FindBy(name="otherphone")
	private WebElement otherPhoneField;
	
	@FindBy(name="email1")
	private WebElement emailField;
	
	@FindBy(name="ownership")
	private WebElement ownershipField;
	
	@FindBy(name="accounttype")
	private WebElement accountTypeDropDownField;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressField;
	
	@FindBy(name="bill_pobox")
	private WebElement billingPOBoxField;
	
	@FindBy(name="bill_city")
	private WebElement billingCityField;
	
	@FindBy(name="bill_state")
	private WebElement billingStateField;
	
	@FindBy(name="bill_code")
	private WebElement billingPostalCodeField;
	
	@FindBy(name="bill_country")
	private WebElement billingCountryField;
	
	@FindBy(xpath="//b[text()='Copy Billing address']/../input")
	private WebElement copybillingCountryField;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@value='Cancel  ']")
	private WebElement cancelButton;

	public WebElement getOrganizationNameField() {
		return organizationNameField;
	}

	public WebElement getWebsiteField() {
		return websiteField;
	}

	public WebElement getFaxField() {
		return faxField;
	}

	public WebElement getEmployeesField() {
		return employeesField;
	}

	public WebElement getOtherEmailField() {
		return otherEmailField;
	}

	public WebElement getIndustryField() {
		return industryField;
	}

	public WebElement getEmailOptOutField() {
		return EmailOptOutField;
	}

	public WebElement getNotifyOwnerField() {
		return notifyOwnerField;
	}

	public WebElement getPhoneField() {
		return PhoneField;
	}

	public WebElement getOtherPhoneField() {
		return otherPhoneField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getOwnershipField() {
		return ownershipField;
	}

	public WebElement getAccountTypeDropDownField() {
		return accountTypeDropDownField;
	}

	public WebElement getBillingAddressField() {
		return billingAddressField;
	}

	public WebElement getBillingPOBoxField() {
		return billingPOBoxField;
	}

	public WebElement getBillingCityField() {
		return billingCityField;
	}

	public WebElement getBillingStateField() {
		return billingStateField;
	}

	public WebElement getBillingPostalCodeField() {
		return billingPostalCodeField;
	}

	public WebElement getBillingCountryField() {
		return billingCountryField;
	}

	public WebElement getCopybillingCountryField() {
		return copybillingCountryField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

}
