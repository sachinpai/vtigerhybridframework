package com.vtiger.testScript;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.ContactInformationPage_Pom;
import com.vtiger.objectRepository.ContactPage_Pom;
import com.vtiger.objectRepository.CreateContactPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.SelectOrganizationWindowPopup_Pom;

@Test
public class CreateContact extends BaseClass {

	public void createContact() throws InterruptedException {
		
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		ContactPage_Pom cp = PageFactory.initElements(driver, ContactPage_Pom.class);
		CreateContactPage_Pom ccp = PageFactory.initElements(driver, CreateContactPage_Pom.class);
		SelectOrganizationWindowPopup_Pom owp = PageFactory.initElements(driver, SelectOrganizationWindowPopup_Pom.class);
		ContactInformationPage_Pom cip = PageFactory.initElements(driver, ContactInformationPage_Pom.class);
		
		hp.clickContactNavLink();
		cp.clickCreateContactIcon();
		ccp.getFirstNameGenderDropDownField();
		Select gender = new Select(ccp.getFirstNameGenderDropDownField());
		gender.selectByValue("Mr.");
		ccp.getFirstNameField().sendKeys("Sachin");
		ccp.getLastNameField().sendKeys("pai");
		ccp.clickOrganizationIcon();
		commanFun.navigateToChildWindow();
		owp.getSearchField().sendKeys("sachinpai.com");
		owp.searchButtonClick();
		Thread.sleep(1000);
		owp.firstResultClick();
		commanFun.navigateToMainWindow();		
		Select ls = new Select(ccp.getLeadSourceDropDownField());
		ls.selectByValue("Other");
		ccp.getTitleField().sendKeys("Manager");
		ccp.getDepartmentField().sendKeys("Finance");
		ccp.getEmailField().sendKeys("admin@sachinpai.com");
		ccp.getAssistantField().sendKeys("mangal pandey");
		ccp.getSecondaryEmailField().sendKeys("finance@sachinpai.com");
		ccp.getDoNotCallCheckboxField().click();
		ccp.getOfficePhoneField().sendKeys("9874563210");
		ccp.getMobileField().sendKeys("1234567893");
		ccp.getHomePhoneField().sendKeys("987456321");
		ccp.getOtherPhoneField().sendKeys("9874563210");
		ccp.getFaxField().sendKeys("987456321");
		ccp.getBirthdateField().sendKeys("1987-04-16");
		ccp.getAssistantPhoneField().sendKeys("9874563210");
		ccp.getEmailOptOutCheckBoxField().click();
		ccp.getReferenceCheckBoxField().click();
		ccp.getNotifyOwnerCheckBoxField().click();
		ccp.getDescriptionTextField().sendKeys("Very cool person");
		ccp.clickSaveButton();
		
		String successMessTextAct = cip.getSuccessMess();
		String successMessTextEpt = "pai Sachin - Contact Information";
		
		if(successMessTextAct.contains(successMessTextEpt)) {
			Reporter.log("Contact Successfully Created",true);
		}else {
			Assert.assertEquals(true, false , "Contact Failed to Create");
		}	
		
	}
}
