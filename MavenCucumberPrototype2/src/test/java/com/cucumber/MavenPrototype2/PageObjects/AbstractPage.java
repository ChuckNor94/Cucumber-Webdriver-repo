package com.cucumber.MavenPrototype2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	//LandingPage landingPage;
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
	}
	
	public LandingPage navigateToWebApp(){
		driver.navigate().to("http://thetestroom.com/webapp/");
		return new LandingPage(driver);
		
	}
	
	public ContactPage navigateToContactPage(String link){
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
		return new ContactPage(driver);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
}
