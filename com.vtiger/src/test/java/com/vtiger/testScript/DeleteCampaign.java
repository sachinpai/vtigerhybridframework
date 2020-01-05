package com.vtiger.testScript;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CampaignPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;

@Test
public class DeleteCampaign extends BaseClass {
	public void deleteCampaign() {
		
		HomePage_Pom home = PageFactory.initElements(driver, HomePage_Pom.class);
		CampaignPage_Pom campaign = PageFactory.initElements(driver, CampaignPage_Pom.class);
		Actions act = new Actions(driver);
		act.moveToElement(home.getMoreNavigationTab()).perform();
		act.click(home.getCampaignLink()).perform();
		campaign.deleteFirstCampaign();
		
	}
}
