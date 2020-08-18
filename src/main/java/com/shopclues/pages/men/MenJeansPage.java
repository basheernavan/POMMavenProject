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
	public void clickPriceSortCheckbox(){
		priceSortCheckbox.get(0).click();
	}
	
	@FindBy(xpath="//*[@id='option_size-men_lower_fct']/li[*]/label") List<WebElement> sizeSortCheckbox;
	public void clickSizeSortCheckbox(){
		sizeSortCheckbox.get(0).click();
	}
	
	

}
