package com.shopclues.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopclues.base.BaseWebDriver;

public class RegistrationPage extends BaseWebDriver{
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;		
	}
	
	@FindBy(xpath="//*[@name='email']") WebElement emailAddress;
	public void typeEmailAddress(String email){
		emailAddress.sendKeys(email);
	}
	
	@FindBy(xpath="//*[@name='phone' and @tabindex='2']") WebElement mobileNumber;
	public void typemobileNumber(String mobile){
		mobileNumber.sendKeys(mobile);
	}

	@FindBy(xpath="//*[@name='register']") WebElement registerButton;
	public void clickRegisterButton(){
		registerButton.click();
	}
}
