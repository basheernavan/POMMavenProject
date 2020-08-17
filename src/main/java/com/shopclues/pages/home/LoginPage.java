package com.shopclues.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopclues.base.BaseWebDriver;

public class LoginPage extends BaseWebDriver{	
	public LoginPage(WebDriver driver){
		this.driver = driver;		
	}
	
	
	
	@FindBy(xpath="//*[@id='main_user_login']") WebElement emailAddress;
	public void typeEmailAddress(String email){
		emailAddress.sendKeys(email);
	}
	
	@FindBy(xpath="//*[@name='password' and @tabindex='2']") WebElement password;
	public void typePassword(String pass){
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//*[@id='login_button']") WebElement loginButton;
	public void clickLoginButton(){
		loginButton.click();
	}
	
	@FindBy(xpath="//*[@id='reg_tab']") WebElement registerTab;
	public void clickRegisterTab(){
		registerTab.click();
	}

}
