package com.vtiger.testScript;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CreateNewProductPage_Pom;
import com.vtiger.objectRepository.HomePage_Pom;
import com.vtiger.objectRepository.ProductInformationPage_Pom;
import com.vtiger.objectRepository.ProductPage_Pom;
import com.vtiger.objectRepository.SelectVendorWindowPopup_Pom;

@Test
public class CreateProduct extends BaseClass {
	
	public void createProduct() throws InterruptedException {
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		ProductPage_Pom pp = PageFactory.initElements(driver, ProductPage_Pom.class);
		CreateNewProductPage_Pom cnp = PageFactory.initElements(driver, CreateNewProductPage_Pom.class);
		SelectVendorWindowPopup_Pom svwp = PageFactory.initElements(driver, SelectVendorWindowPopup_Pom.class);
		ProductInformationPage_Pom pip = PageFactory.initElements(driver, ProductInformationPage_Pom.class);
		
		hp.ClickProductNavLink();
		pp.clickCreateProductIcon();
		cnp.getProductNameField().sendKeys("Colgate");
		Select s = new Select(cnp.getProductCategoryDropDown());
		s.selectByValue("Hardware");
		cnp.vendorNameIconButtonClick();
		commanFun.navigateToChildWindow();
		svwp.getSearchField().sendKeys("Big Bazar");
		svwp.searchButtonClick();
		Thread.sleep(2000);
		svwp.firstSearchResultClick();
		commanFun.navigateToMainWindow();
		cnp.getSerialNoField().sendKeys("10189");
		cnp.getSalesStartDateField().sendKeys("2020-01-01");
		cnp.getSalesEndDateField().sendKeys("2021-01-01");
		cnp.getWebsiteField().sendKeys("www.sachinpai.com");
		cnp.getQtyInStockWebsiteField().sendKeys("0");
		cnp.saveButtonClick();
		String successMessTextAct = pip.getSuccessMess();
		String successMessTextEpt = "Colgate - Product Information";
		
		if(successMessTextAct.contains(successMessTextEpt)) {
			Reporter.log("Product Successfully Created",true);
		}else {
			Assert.assertEquals(true, false , "Product Failed to Create");
		}
		
		
		
		
		
		
	}

}
