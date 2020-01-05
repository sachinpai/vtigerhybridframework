package com.vtiger.testScript;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CreateQuotePage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.QuoteInformationPage;
import com.vtiger.objectRepository.QuotePage_Pom;
import com.vtiger.objectRepository.SelectOpportunityWindowPopup_Pom;
import com.vtiger.objectRepository.SelectOrganizationWindowPopup_Pom;
import com.vtiger.objectRepository.SelectProductWindowPopup_Pom;


public class CreateQuotesTest extends BaseClass{
	
	@Test
	public void createQuotecreateOrganization() throws InterruptedException {
		
		QuotePage_Pom qp = PageFactory.initElements(driver, QuotePage_Pom.class);
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		CreateQuotePage_Pom cqp = PageFactory.initElements(driver, CreateQuotePage_Pom.class);
		SelectOpportunityWindowPopup_Pom sowp = PageFactory.initElements(driver, SelectOpportunityWindowPopup_Pom.class);
		SelectOrganizationWindowPopup_Pom sorgwp = PageFactory.initElements(driver, SelectOrganizationWindowPopup_Pom.class);
		SelectProductWindowPopup_Pom spwp = PageFactory.initElements(driver, SelectProductWindowPopup_Pom.class);
		QuoteInformationPage qip = PageFactory.initElements(driver, QuoteInformationPage.class);
		
		
//		CreateOrganization createOrg = new CreateOrganization();
//		createOrg.createOrganization();
//		CreateContact createCon = new CreateContact();
//		createCon.createContact();
//		CreateOpportunity createOpp = new CreateOpportunity();
//		createOpp.createOpportunity();
//		CreateProduct createPro = new CreateProduct();
//		createPro.createProduct();
		
		commanFun.moveToNavLink(hp.getMoreNavigationTab());
		hp.getQuotesNavLink().click();
		qp.ClickNewQuoteButton();
		cqp.getSubjectField().sendKeys("Colgate Quote");
		cqp.getValidTillField().sendKeys("2020-01-01");
		Select s = new Select(cqp.getCarrierDropDown());
		s.selectByValue("FedEx");
		Select s1 = new Select(cqp.getInventoryManagerDropDown());
		s1.selectByValue("1");
		cqp.opportunityNameWindowPopUpButtonClick();
		commanFun.navigateToChildWindow();
		sowp.getSearchField().sendKeys("Pre New Year Sale");
		sowp.searchButtonClick();
		Thread.sleep(2000);
		sowp.firstSearchResultClick();
		commanFun.navigateToMainWindow();
		
		Select s2 = new Select(cqp.getQuoteStageDropDown());
		s2.selectByValue("Created");
		
		cqp.getShippingField().sendKeys("DirectlyFromVendor");
		cqp.organizationNameWindowPopUpButtonClick();
		
		//Handling Organization Window Popup
		commanFun.navigateToChildWindow();
		sorgwp.getSearchField().sendKeys("sachinpai.com");
		sorgwp.searchButtonClick();
		Thread.sleep(2000);
		sorgwp.firstResultClick();
		BaseClass.driver.switchTo().alert().accept();
		commanFun.navigateToMainWindow();
		
		Thread.sleep(2000);
		
		commanFun.waitForElement(cqp.getAddProductButton());
		System.out.println("Element Found");
		cqp.getAddProductButton().click();
		
		//Handling Product Window Popup
		commanFun.navigateToChildWindow();
		spwp.getSearchField().sendKeys("colgate");
		spwp.searchButtonClick();
		spwp.firstResultClick();
		commanFun.navigateToMainWindow();
		
		cqp.getQtyField().sendKeys("100");
		cqp.getListPriceField().sendKeys("100");
		cqp.saveButtonClick();
		
		String actMessage = qip.getSuccessMess();
		String expMessage = "Colgate Quote - Quote Information";
		
		if(actMessage.contains(expMessage)) {
			Reporter.log("Quote Got Created",true);
		} else {
			Assert.assertEquals(false, true,"Quote Failed to create");
		}
		
		qip.clickDuplicateButton();
		cqp.saveButtonClick();
		qip.ClickQuotesLink();
		qp.getSearchTextField().sendKeys("Colgate Quote");
		Select s4 = new Select(qp.getsearchIn());
		s4.selectByValue("subject");
		qp.clickSearchButton();
		
		int i=0;
		String seachTxt = "Colgate Quote";
		
		List<WebElement> findElements = driver.findElements(By.xpath("//td//a[@title='Quotes']"));
		Iterator<WebElement> it = findElements.iterator();
		while(it.hasNext()) {
			WebElement element = it.next();
			String fvalue = element.getText();
			System.out.println(fvalue);
			if(fvalue.equals(seachTxt)) {
				i++;
			}
		}
		
		if( i >= 2 ) {
			System.out.println("No of Count"+i);
			Reporter.log("Duplicate Record Created",true);
		} else {
			Reporter.log("Duplicate Failed to create",true);
			Assert.assertEquals(true, false);
		}	
	}
	
}
