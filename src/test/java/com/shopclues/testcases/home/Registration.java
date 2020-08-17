package com.shopclues.testcases.home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.home.LoginPage;
import com.shopclues.pages.home.RegistrationPage;

public class Registration extends BaseWebDriver{
	
	@Test
	public void registration() throws InterruptedException{
		openBrowser("chrome");
		navigateUrl("https://www.shopclues.com/");
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.clickSinginLink();
		Thread.sleep(2000);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		home.clickNotifiDontAllow();
		login.clickRegisterTab();
		RegistrationPage register = PageFactory.initElements(driver, RegistrationPage.class);
		register.typeEmailAddress("basheer@admin.com");
		register.typemobileNumber("2345678");
		register.clickRegisterButton();	
		
		closeBrowser();
	}

}
