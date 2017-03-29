package com.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class = 'container']/ul/li") List<WebElement> socialicons;
	
	@FindBy(how=How.XPATH,using="//ul[@class='nav navbar-nav']/li") List<WebElement> socialTabs;
	
	@FindBy(how = How.XPATH,using="//a[@class='btn btn-cta']") WebElement enrollNow;
	
	public int countSocialIcons(){
		
		return socialicons.size(); 
	}
	
	public int countSocialTabs(){
		
		return socialTabs.size();
	}
	
	public boolean isEnrollPresent(){
		
		return enrollNow.isDisplayed();
	}

}
