package com.shopclues.pages.men;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.shopclues.base.BaseWebDriver;
public class MenSportsShoesPage extends BaseWebDriver{
	
	public MenSportsShoesPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id='option_size_-_ind_or_uk_fct']/li/label") List<WebElement> shoesSizeSort;
	public void clickShoesSize(){
		shoesSizeSort.get(3).click();
	}
	
	@FindBy(xpath="//*[@id='sort_price_fct']/li[*]/label") List<WebElement> shoesPriceSort;
	public void clickShoesPrice(){
		shoesPriceSort.get(0).click();
	}

}
