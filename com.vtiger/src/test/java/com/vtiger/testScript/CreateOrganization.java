package com.vtiger.testScript;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CreateOrganizationPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.OrganizationInformationPage_Pom;
import com.vtiger.objectRepository.OrganizationPage_Pom;

public class CreateOrganization extends BaseClass  {

	
		@Test
		public void createOrganization() {
			HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
			OrganizationPage_Pom op = PageFactory.initElements(driver, OrganizationPage_Pom.class);
			CreateOrganizationPage_Pom co = PageFactory.initElements(driver, CreateOrganizationPage_Pom.class);
			OrganizationInformationPage_Pom oip = PageFactory.initElements(driver, OrganizationInformationPage_Pom.class);
			
			
			hp.clickOrganizationsNavLink();
			op.clickCreateOrganizationButton();
			co.getOrganizationNameField().sendKeys("sachinpai.com");
			co.getWebsiteField().sendKeys("www.sachinpai.com");
			co.getFaxField().sendKeys("987456320");
			co.getEmployeesField().sendKeys("10");
			co.getOtherEmailField().sendKeys("admin@sachinpai.com");
			
			Select s = new Select(co.getIndustryField());
			s.selectByValue("Technology");
			
			co.getEmailOptOutField().click();
			co.getNotifyOwnerField().click();
			
			co.getPhoneField().sendKeys("98745631");
			co.getOtherPhoneField().sendKeys("321456987");
			co.getEmailField().sendKeys("webmaster@sachinpai.com");
			co.getOwnershipField().sendKeys("Sole Proprietor");
			
			Select typed = new Select(co.getAccountTypeDropDownField());
			typed.selectByValue("Other");
			
			co.getBillingAddressField().sendKeys("Qspider galli");
			co.getBillingPOBoxField().sendKeys("8964");
			co.getBillingCityField().sendKeys("Bnagalore");
			co.getBillingStateField().sendKeys("Karnataka");
			co.getBillingPostalCodeField().sendKeys("56008");
			co.getBillingCountryField().sendKeys("India");
			co.getCopybillingCountryField().click();
			co.getSaveButton().click();
			String successMessTextAct = oip.getSuccessMess();
			String successMessTextEpt = "sachinpai.com - Organization Information";
			
			if(successMessTextAct.contains(successMessTextEpt)) {
				Reporter.log("Organization Successfully Created",true);
			}else {
				Assert.assertEquals(true, false , "Organization Failed to Create");
			}			
			
		}
}
