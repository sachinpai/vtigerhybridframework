package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewProductPage_Pom {
	
	@FindBy(name="productname")
	private WebElement productNameField;
	
	@FindBy(name="discontinued")
	private WebElement productActiveCheckBox;
	
	@FindBy(name="productcategory")
	private WebElement productCategoryDropDown;
	
	@FindBy(xpath="//input[@name='vendor_name']/following-sibling::img")
	private WebElement vendorNameIconButton;
	
	@FindBy(id="serial_no")
	private WebElement serialNoField;
	
	@FindBy(id="jscal_field_sales_start_date")
	private WebElement salesStartDateField;
	
	@FindBy(id="jscal_field_sales_end_date")
	private WebElement salesEndDateField;
	
	@FindBy(name="website")
	private WebElement websiteField;
	
	@FindBy(id="qtyinstock")
	private WebElement qtyInStockWebsiteField;
	
	@FindBy(id="my_file_element")
	private WebElement ProductImageUploadButton;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@value='  Cancel  ']")
	private WebElement cancelButton;

	public WebElement getProductNameField() {
		return productNameField;
	}

	public WebElement getProductActiveCheckBox() {
		return productActiveCheckBox;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getVendorNameIconButton() {
		return vendorNameIconButton;
	}

	public WebElement getSerialNoField() {
		return serialNoField;
	}

	public WebElement getSalesStartDateField() {
		return salesStartDateField;
	}

	public WebElement getSalesEndDateField() {
		return salesEndDateField;
	}

	public WebElement getWebsiteField() {
		return websiteField;
	}

	public WebElement getQtyInStockWebsiteField() {
		return qtyInStockWebsiteField;
	}

	public WebElement getProductImageUploadButton() {
		return ProductImageUploadButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	//Business Logic
	
	public void vendorNameIconButtonClick() {
		vendorNameIconButton.click();
	}
	
	public void ProductImageUploadButton() {
		ProductImageUploadButton.click();
	}
	
	public void saveButtonClick() {
		saveButton.click();
	}
	
	public void cancelButton() {
		cancelButton.click();
	}
	
}
