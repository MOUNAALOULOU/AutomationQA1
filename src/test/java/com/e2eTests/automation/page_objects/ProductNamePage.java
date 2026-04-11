package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ProductNamePage extends BasePage {

	/* Retrieve element */
	
	

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Logout']")
	private static WebElement catalogBtn;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[1]/a")
	private static WebElement productsBtn;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement searchProductName;
	
	@FindBy(how = How.ID, using = "search-products")
	private static WebElement searchBtn;
	

	public ProductNamePage() {
		super(Setup.getDriver());

	}
	
	
	public static WebElement getCatalogBtn() {
		return catalogBtn;
	}

	public static WebElement getProductsBtn() {
		return productsBtn;
	}

	public static WebElement getSearchProductName() {
		return searchProductName;

	}
	
	
	public static WebElement getSearchBtn() {
		return searchBtn;

	}


}
