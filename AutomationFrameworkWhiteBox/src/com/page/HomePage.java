package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	public HomePage(PageDriver driver) {
		super(driver);
		driver.getUrl(Configuration.URL);
		driver.maxBrowser();
	}
	
	

//test the functionality of social icons

public int scoialIcons(){
	int count = 0;
	List<WebElement> sociallink=driver.findElements(By.xpath(Locators.loc.get("sociallinks")));
	while(sociallink!=null){
		count = sociallink.size();
		
	}
	return count;
	
}
//click on login button
public String clickLogin(){
	String url;
	driver.findElement(By.id(Locators.loc.get("loginlink"))).click();
	url = driver.getCurrentUrl();
	return url;
}
	
	
	

}
