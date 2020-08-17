package com.shopclues.testcases.home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.home.LoginPage;

public class Login extends BaseWebDriver{
	
	@Test
	public void login(){
		openBrowser("chrome");
		navigateUrl("https://www.shopclues.com/");
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.clickSinginLink();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		home.clickNotifiDontAllow();
		login.typeEmailAddress("vardhan@admin.com");
		login.typePassword("test@1234");
		login.clickLoginButton();
		closeBrowser();
	}

}
