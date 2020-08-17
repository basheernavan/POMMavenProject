package com.shopclues.testcases.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.home.LoginPage;

public class SearchItems extends BaseWebDriver{
	
	@Test
	public void searchItems() throws InterruptedException{
		openBrowser("chrome");
		navigateUrl("https://www.shopclues.com/");		
		Thread.sleep(12000);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		//clicking on notification alert
		home.clickNotifiDontAllow();
		home.typeSearchBox("T-Shirts");
		Thread.sleep(3000);
		//home.clickSearchButton();
		List<WebElement> items = driver.findElements(By.xpath("//*[@id='search-result']//child::li"));
		int totalItems = items.size();
		System.out.println("Total items: "+totalItems);
		
		for(int i=0;i<totalItems;i++){
			System.out.println("Item Name: "+items.get(i).getText());
		}
		
		
	}
	

}
