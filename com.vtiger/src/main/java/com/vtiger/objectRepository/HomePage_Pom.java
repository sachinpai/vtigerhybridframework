package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Pom {
	
	public HomePage_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Calendar")
	private WebElement calendarNavLink;
	
	@FindBy(linkText="Leads")
	private WebElement leadsNavLink;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationsNavLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsNavLink;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesNavLink;
	
	@FindBy(linkText="Products")
	private WebElement productsNavLink;
	
	@FindBy(linkText="Documents")
	private WebElement documentsNavLink;
	
	@FindBy(linkText="Email")
	private WebElement emailNavLink;
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement troubleTicketsNavLink;
	
	@FindBy(linkText="Dashboard")
	private WebElement dashboardNavLink;
		
	@FindBy(linkText="More")
	private WebElement moreNavigationTab;
	
	@FindBy(name="Campaigns")
	private WebElement campaignLink;
	
	@FindBy(linkText="Vendors")
	private WebElement vendorsNavLink;
	
	@FindBy(linkText="Invoice")
	private WebElement InvoiceNavLink;
	
	@FindBy(linkText="Sales Order")
	private WebElement salesOrderNavLink;
	
	@FindBy(linkText="Quotes")
	private WebElement quotesNavLink;
	
	@FindBy(id="qccombo")
	private WebElement quickCreateDropDownSelection;
	
	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td/img")
	private WebElement logoutIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logoutLink;
	
	//Getters Method
	
	public WebElement getCalendarNavLink() {
		return calendarNavLink;
	}

	public WebElement getLeadsNavLink() {
		return leadsNavLink;
	}

	public WebElement getOrganizationsNavLink() {
		return organizationsNavLink;
	}

	public WebElement getContactsNavLink() {
		return contactsNavLink;
	}

	public WebElement getOpportunitiesNavLink() {
		return opportunitiesNavLink;
	}

	public WebElement getProductsNavLink() {
		return productsNavLink;
	}

	public WebElement getDocumentsNavLink() {
		return documentsNavLink;
	}

	public WebElement getEmailNavLink() {
		return emailNavLink;
	}

	public WebElement getTroubleTicketsNavLink() {
		return troubleTicketsNavLink;
	}

	public WebElement getDashboardNavLink() {
		return dashboardNavLink;
	}

	public WebElement getVendorsNavLink() {
		return vendorsNavLink;
	}

	public WebElement getInvoiceNavLink() {
		return InvoiceNavLink;
	}

	public WebElement getSalesOrderNavLink() {
		return salesOrderNavLink;
	}

	public WebElement getQuotesNavLink() {
		return quotesNavLink;
	}

	public WebElement getLogoutIcon() {
		return logoutIcon;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getMoreNavigationTab(){		
		return moreNavigationTab;		
	}
		
	public WebElement getCampaignLink(){		
		return campaignLink;		
	}
	
	public WebElement getQuickCreateDropDownSelection() {
		return quickCreateDropDownSelection;
	}
	
	//Business Logic
	
	public void clickOrganizationsNavLink() {
		organizationsNavLink.click();
	}
	
	public void clickContactNavLink() {
		contactsNavLink.click();
	}
	
	public void ClickOpportunityNavLink() {
		opportunitiesNavLink.click();
	}
	
	public void ClickProductNavLink() {
		productsNavLink.click();
	}

	public void ClickLogout() {
		logoutIcon.click();
		logoutLink.click();
	}
	
	

}
