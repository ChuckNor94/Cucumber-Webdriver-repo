package com.cucumber.MavenPrototype2.LibraryPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends AbstractPage {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getSearchResults(){
		System.out.println(driver.findElement(By.className("resultsToolbar_num_results")).getText());
		return driver.findElement(By.className("resultsToolbar_num_results")).getText();
		
	}

}
