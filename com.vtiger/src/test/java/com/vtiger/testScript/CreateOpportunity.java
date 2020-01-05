package com.vtiger.testScript;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CreateOpportunityPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.OpportunityInformationPage_Pom;
import com.vtiger.objectRepository.OpportunityPage_Pom;
import com.vtiger.objectRepository.SelectCampaignWindowPopup_Pom;
import com.vtiger.objectRepository.SelectOrganizationWindowPopup_Pom;

@Test
public class CreateOpportunity extends BaseClass {
	
	public void createOpportunity() throws InterruptedException {
		
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		OpportunityPage_Pom op = PageFactory.initElements(driver, OpportunityPage_Pom.class);
		CreateOpportunityPage_Pom cop = PageFactory.initElements(driver, CreateOpportunityPage_Pom.class);
		SelectOrganizationWindowPopup_Pom sop = PageFactory.initElements(driver, SelectOrganizationWindowPopup_Pom.class);
		OpportunityInformationPage_Pom oip = PageFactory.initElements(driver, OpportunityInformationPage_Pom.class);
		SelectCampaignWindowPopup_Pom scwp = PageFactory.initElements(driver, SelectCampaignWindowPopup_Pom.class);
		
		hp.ClickOpportunityNavLink();
		
		op.createNewOpportunityIconClick();
		
		cop.getOpportunityNameField().sendKeys("Pre New Year Sale");
		cop.relatedToIconClick();
		commanFun.navigateToChildWindow();
		sop.getSearchField().sendKeys("sachinpai.com");
		sop.searchButtonClick();
		Thread.sleep(2000);
		sop.firstResultClick();
		commanFun.navigateToMainWindow();
		Select s1 = new Select(cop.getTypeDropDownField());
		s1.selectByValue("New Business");
		Select s2 = new Select(cop.getLeadSourceDropDownField());
		s2.selectByValue("Cold Call");
		
		cop.campaignSourceIconClick();
		
		commanFun.navigateToChildWindow();
		scwp.getSearchField().sendKeys("Spread Education");
		scwp.searchButtonClick();
		Thread.sleep(2000);
		scwp.firstSearchResultClick();		
		commanFun.navigateToMainWindow();
		
		cop.getAmountField().sendKeys("10000");
		cop.getExpectedCloseDateField().sendKeys("2020-01-01");
		cop.getnextStepField().sendKeys("Flow up");
		Select s3 = new Select(cop.getSalesStageDropDownField());
		s3.selectByValue("Prospecting");
		cop.getProbabilityField().sendKeys("80");
		cop.getDescriptionTextBoxField().sendKeys("Final offer");
		cop.saveButton();
		
		String successMessTextAct = oip.getSuccessMessText();
		String successMessTextEpt = "Pre New Year Sale - Opportunity Information";
		
		if(successMessTextAct.contains(successMessTextEpt)) {
			Reporter.log("Opportunity Successfully Created",true);
		}else {
			Assert.assertEquals(true, false , "Opportunity Failed to Create");
		}	
		
	}

}
