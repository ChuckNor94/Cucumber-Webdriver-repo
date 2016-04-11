package com.cucumber.MavenPrototype2.LibraryPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class LibrarySearchPage extends AbstractPage {

	public LibrarySearchPage(WebDriver driver) {
		super(driver);		
	}
	
	public LibrarySearchPage selectSearchOption(String searchOption){
		Select searchByDropDown = new Select(driver.findElement(By.id("restrictionDropDown")));
		System.out.println("Search option is " +searchOption);
		searchByDropDown.selectByVisibleText(searchOption);
		return new LibrarySearchPage(driver);
	}
	
	public LibrarySearchPage enterSearchText(String searchText){
		WebElement inputBox = driver.findElement(By.id("q"));
		inputBox.sendKeys(searchText);
		return new LibrarySearchPage(driver);
	}
	
	public SearchResultsPage clickSearchButton(){
		WebElement searchButton = driver.findElement(By.id("searchButton"));
		searchButton.click();
		return new SearchResultsPage(driver);
	}

}
