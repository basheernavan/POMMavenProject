package com.shopclues.testcases.home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.home.LoginPage;
import com.shopclues.util.GenericFunctions;
import com.shopclues.util.XLS_Reader;

public class Login extends BaseWebDriver{
	
	@Test(dataProvider="getData")
	public void login(String uname, String pass) throws InterruptedException{
		openBrowser("chrome");
		navigateUrl("https://www.shopclues.com/");
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.clickSinginLink();
		Thread.sleep(5000);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		home.clickNotifiDontAllow();	
		login.typeEmailAddress(uname);
		login.typePassword(pass);
		login.clickLoginButton();
		closeBrowser();
	}
	
	@DataProvider
	public Object[][] getData(){
		XLS_Reader xls =new XLS_Reader("src/test/java/com/shopclues/testdata/home.xlsx");
		return GenericFunctions.getTestData(xls, "login");		
	}

}
