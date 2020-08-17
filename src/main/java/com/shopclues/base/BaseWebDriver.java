package com.shopclues.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BaseWebDriver {
	public WebDriver driver;
	
	//Open Browser function:
	public void openBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();			
		}else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();		
		}else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.ie.driver", "resources/drivers/msedgedriver.exe");
			driver = new EdgeDriver();	
		}		
	}
	
	//Navigete url/open url:
	public void navigateUrl(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//get title function:
	public void getAppTitle(){
		String title = driver.getTitle();
		System.out.println("Application Title: "+title);
	}
	
	//Close Browser Function:
	public void closeBrowser(){
		driver.quit();
	}
}
