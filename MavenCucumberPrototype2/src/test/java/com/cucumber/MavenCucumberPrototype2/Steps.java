/*package com.cucumber.MavenCucumberPrototype2;

//import org.junit.Assert;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.MavenPrototype2.PageObjects.ContactConfirmPage;
import com.cucumber.MavenPrototype2.PageObjects.ContactPage;
import com.cucumber.MavenPrototype2.PageObjects.LandingPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver = new FirefoxDriver();
	LandingPage landingPage;
	ContactPage contactPage;
	ContactConfirmPage contactConfirmPage;
	
	@Given("^I am on the zoo site$")
	public void I_am_on_the_zoo_site() throws Throwable {
		landingPage = new LandingPage(driver);
		landingPage.navigateToWebApp();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void I_click_on(String link) throws Throwable {
		contactPage = landingPage.navigateToContactPage(link);
	}

	@When("^I enter \"([^\"]*)\" into the name field$")
	public void I_enter_into_the_name_field(String value) throws Throwable {
		contactPage.setNameField(value);
	}

	@When("^I enter \"([^\"]*)\" into the address field$")
	public void I_enter_into_the_address_field(String value) throws Throwable {
		contactPage.setAddressField(value);
	}

	@When("^I enter \"([^\"]*)\" into the postcode field$")
	public void I_enter_into_the_postcode_field(String value) throws Throwable {
		contactPage.setPostCodeField(value);
	}

	@When("^I enter \"([^\"]*)\" into the email field$")
	public void I_enter_into_the_email_field(String value) throws Throwable {
		contactPage.setEmailField(value);
	}

	@When("^I submit the contact form$")
	public void I_submit_the_contact_form() throws Throwable {
		contactConfirmPage = contactPage.submitContactForm();
	}
	
	@Then("^I check I am on the confirmation page$")
	public void I_check_I_am_on_the_confirmation_page() throws Throwable {
		Assert.assertTrue(contactConfirmPage.getTitle().contains("We have your message"));
	}

	@Then("^I close the browser$")
	public void I_close_the_browser() throws Throwable {
		contactConfirmPage.closeBrowser();
	}
	
	@After()
	public void closeBrowser(){
		driver.close();
	}
	

}*/
