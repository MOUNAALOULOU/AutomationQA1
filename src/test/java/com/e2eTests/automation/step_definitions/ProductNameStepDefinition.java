package com.e2eTests.automation.step_definitions;


import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.Then;


public class ProductNameStepDefinition {
	
	public ProductNamePage productNamePage;
	
	public ProductNameStepDefinition() { 
		productNamePage = new ProductNamePage();
	}
	
	
	@Then("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
	ProductNamePage.getCatalogBtn().click();
		
		
		
	   
	}
	@Then("je clique sur Products")
	public void jeCliqueSurProducts() {
		ProductNamePage.getProductsBtn().click();
	   
		
	}


	@Then("je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String string) {
		ProductNamePage.getSearchProductName().sendKeys("bijoux");
	   
	}



	@Then("je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		ProductNamePage.getSearchBtn().click();
	 
	}




}
