package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefintion {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public LoginStepDefintion() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	/* @login-valide */

	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {
		//Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//Setup.getDriver().get(configFileReader.getProperties("home.url"));
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}

	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) throws InterruptedException {
		seleniumUtils.writeText(LoginPage.getPassword(), login);

	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		//LoginPage.getBtnLogin().click();
		seleniumUtils.click(LoginPage.getBtnLogin());

	}
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	    Assert.assertTrue(
	        Setup.getDriver().getCurrentUrl()
	             .contains("Admin")
	    );
	}

	/* @login-invalide */

	
	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {
	    Assert.assertTrue(
	        LoginPage.getErrorMessage().isDisplayed());
	}
	
	/* @Outline */
	
	
	
	
}
