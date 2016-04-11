package com.cucumber.MavenCucumberPrototype2;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.MavenPrototype2.LibraryPageObjects.LibrarySearchPage;
import com.cucumber.MavenPrototype2.LibraryPageObjects.SearchResultsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LibrarySteps {
	
	WebDriver driver = new FirefoxDriver();
	LibrarySearchPage librarySearchPage;
	SearchResultsPage searchResultsPage;
	
	@Given("^I am on the london library search page$")
	public void I_am_on_the_london_library_search_page() throws Throwable {
		librarySearchPage = new LibrarySearchPage(driver);
		librarySearchPage.navigateToLibrarySearchPage();
		
	}

	@When("^I select the search option ([^\"]*)$")
	public void I_select_the_search_option(String searchOption) throws Throwable {
		librarySearchPage.selectSearchOption(searchOption);
		
	}

	@And("^I enter the search text ([^\"]*)$")
	public void I_enter_the_search_text_searchText(String searchText) throws Throwable {
		librarySearchPage.enterSearchText(searchText);
	}

	@And("^I click the search button$")
	public void I_click_the_search_button() throws Throwable {
		searchResultsPage = librarySearchPage.clickSearchButton();
	}

	@Then("^I will get ([^\"]*) search results$")
	public void I_will_get_numberOfResults_search_results(String searchResults) throws Throwable {
		Assert.assertTrue(searchResultsPage.getSearchResults().contains(searchResults));
	}
	
	/*@And("^I close the browser$")
	public void closeBrowser(){
		searchResultsPage.closeBrowser();
	}*/
	
	@After()
	public void closeBrowser(){
		driver.close();
	}
	
	/*@Before()
	public void openBrowser(){
		driver = new FirefoxDriver();
	}*/

}
