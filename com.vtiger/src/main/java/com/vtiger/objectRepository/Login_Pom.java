package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	
	public Login_Pom(WebDriver driver ){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[contains(text(),'username and password')]")
	private WebElement errorMessage;
	
	//Getters Method
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}
	
	//Business Logic
	
	public void loginToApplication(String un, String pass) {
		userName.sendKeys(un);
		password.sendKeys(pass);
		submitButton.click();
	}
	
	public String ErrorMessage(String Exp) {
		String actualError = errorMessage.getText();
		return actualError;
	}
}
