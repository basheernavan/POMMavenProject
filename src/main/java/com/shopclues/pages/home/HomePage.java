package com.shopclues.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopclues.base.BaseWebDriver;

public class HomePage extends BaseWebDriver{
	//Create Constructor
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[contains(@class, 'moe-btn-close')]") WebElement notifiDontAllow;
	public void clickNotifiDontAllow(){
		notifiDontAllow.click();
	}
	
	//Declare page element and page methods.
	@FindBy(linkText="Sign In") WebElement signinLink;
	public void clickSinginLink(){
		signinLink.click();
	}
	
	@FindBy(xpath="//*[@id='autocomplete']") WebElement searchBox;
	public void typeSearchBox(String item){
		searchBox.sendKeys(item);
	}
	
	@FindBy(linkText="//*[@class='srch_action btn orange']") WebElement searchButton;
	public void clickSearchButton(){
		searchButton.click();
	}
	
	
	

}
