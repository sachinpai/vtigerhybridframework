package com.vtiger.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CampaignConfirmation_Pom;
import com.vtiger.objectRepository.CampaignPage_Pom;
import com.vtiger.objectRepository.CreateCampaignPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;

public class CreateCampaignTest extends BaseClass {
	
	@Test
	public void createCampaignInVtiger() throws EncryptedDocumentException, IOException{
		//Object Creation
		HomePage_Pom homepage = PageFactory.initElements(driver, HomePage_Pom.class);
		CampaignPage_Pom campaignPage = PageFactory.initElements(driver, CampaignPage_Pom.class);
		CreateCampaignPage_Pom createCampaign = PageFactory.initElements(driver, CreateCampaignPage_Pom.class);
		CampaignConfirmation_Pom confirmPage = PageFactory.initElements(driver, CampaignConfirmation_Pom.class);
		
		//actions
		Actions act = new Actions(driver);
		act.moveToElement(homepage.getMoreNavigationTab()).perform();
		act.click(homepage.getCampaignLink()).perform();
		campaignPage.clickOnNewCampaign();
		
		String campaignName = f.FetchExcelFileData("Sheet1", 0, 1);
		
		createCampaign.fillCampaignNameField(campaignName);
		createCampaign.clickSave();
		
		String actMessage = confirmPage.getConfirmationMessage();
		String expMessage = f.FetchExcelFileData("Sheet1", 1, 1);
		
		if(actMessage.contains(expMessage)) {
			Reporter.log("Campaign Got Created",true);
		} else {
			Assert.assertEquals(false, true,"Campaign Failed to create");
		}		
	}
}
