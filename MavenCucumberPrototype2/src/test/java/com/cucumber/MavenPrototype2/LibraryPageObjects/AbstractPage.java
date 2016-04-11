package com.cucumber.MavenPrototype2.LibraryPageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
	}
	
	public LibrarySearchPage navigateToLibrarySearchPage(){
		driver.navigate().to("https://col.ent.sirsidynix.net.uk/client/en_GB/default/");
		return new LibrarySearchPage(driver);
	}
	
	public void closeBrowser(){
		driver.quit();
	}

}
