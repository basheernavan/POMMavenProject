package com.shopclues.pages.men;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopclues.base.BaseWebDriver;
public class MenJeansPage extends BaseWebDriver {
	//Create Constructor
	public MenJeansPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id='sort_price_fct']/li[*]/label") List<WebElement> priceSortCheckbox;
	public void clickPriceSortCheckbox(int price){
		priceSortCheckbox.get(price).click();
	}
	
	@FindBy(xpath="//*[@id='option_size-men_lower_fct']/li[*]/label") List<WebElement> sizeSortCheckbox;
	public void clickSizeSortCheckbox(int size){
		sizeSortCheckbox.get(size).click();
	}
	
	@FindBy(xpath="//*[contains(@id, 'det_img_')]") List<WebElement> jeansimages;
	public void clickJeansImage(int image){
		jeansimages.get(image).click();
	}
	@FindBy(xpath="//*[contains(@class,'variant')]") WebElement selectSizeInCart;
	public void clickSizeInCart(){
		selectSizeInCart.click();
	}
	
	@FindBy(xpath="//*[@id='add_cart']") WebElement cartButton;
	public void clickCartButton(){
		cartButton.click();
	}

}
