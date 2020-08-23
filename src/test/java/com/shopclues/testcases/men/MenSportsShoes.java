package com.shopclues.testcases.men;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopclues.base.BaseWebDriver;
import com.shopclues.pages.home.HomePage;
import com.shopclues.pages.men.MenJeansPage;
import com.shopclues.pages.men.MenSportsShoesPage;

public class MenSportsShoes extends BaseWebDriver{
	@Test
	public void registration() throws InterruptedException{
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.clickNotifiDontAllow();
		Thread.sleep(3000);	
		home.clickmenMenu();
		Thread.sleep(1000);
		home.clickMenSportsShoes();
		Thread.sleep(3000);	
		Set<String> allwindowids = driver.getWindowHandles();
		Iterator<String> iter = allwindowids.iterator();		
		String mainwindow = iter.next();
		String newwindow = iter.next();
		System.out.println("Main window: "+mainwindow);
		System.out.println("New window: "+newwindow);
		driver.switchTo().window(newwindow);
		
		MenSportsShoesPage sportsShoes = PageFactory.initElements(driver, MenSportsShoesPage.class);
		sportsShoes.clickShoesSize();
		Thread.sleep(3000);	
		
		sportsShoes.clickShoesPrice();
		Thread.sleep(3000);	
	}

}
