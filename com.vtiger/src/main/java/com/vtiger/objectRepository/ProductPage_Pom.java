package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage_Pom {

	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement CreateProductIcon;

	public WebElement getCreateProductIcon() {
		return CreateProductIcon;
	}
	
	public void clickCreateProductIcon() {
		CreateProductIcon.click();
	}
}
