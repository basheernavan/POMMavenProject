package com.shopclues.testcases.men;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.men.MenJeansPage;

public class MenJeans extends BaseWebDriver{
	@Test
	public void registration() throws InterruptedException{
		openBrowser("chrome");
		navigateUrl("https://www.shopclues.com/");
		Thread.sleep(12000);		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.clickNotifiDontAllow();
		Thread.sleep(3000);	
		home.clickmenMenu();
		Thread.sleep(2000);	
		home.clickMenJeans();
		Thread.sleep(8000);	
		Set<String> allwindowids = driver.getWindowHandles();
		Iterator<String> iter = allwindowids.iterator();
		/*while(iter.hasNext()){
			System.out.println(iter.next());
		}*/
		String mainwindow = iter.next();
		String newwindow = iter.next();
		System.out.println("Main window: "+mainwindow);
		System.out.println("New window: "+newwindow);
		driver.switchTo().window(newwindow);
		MenJeansPage menjeans = PageFactory.initElements(driver, MenJeansPage.class);
		menjeans.clickPriceSortCheckbox();
		Thread.sleep(3000);
		menjeans.clickSizeSortCheckbox();
		Thread.sleep(3000);		
		menjeans.clickJeansImage();
		Thread.sleep(8000);	
		Set<String> allwindowids1 = driver.getWindowHandles();
		Iterator<String> iter1 = allwindowids1.iterator();
		/*while(iter.hasNext()){
			System.out.println(iter.next());
		}*/
		
		String window1 = iter1.next();
		String window2 = iter1.next();
		String window3 = iter1.next();
		System.out.println("WindowId: "+window1);
		System.out.println("WindowId: "+window2);
		System.out.println("WindowId: "+window3);
		
		driver.switchTo().window(window3);
		Thread.sleep(3000);	
		menjeans.clickSizeInCart();
		menjeans.clickCartButton();
		Thread.sleep(3000);	
		closeBrowser();
		
	}

}
