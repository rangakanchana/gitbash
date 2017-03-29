package com.page;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.PageDriver;

public class HomePage extends BasePage {
	
	String sociallinks = "css_social-link";
	String loginlink = "xpath_login-link";

	public HomePage(PageDriver driver) {
		
		super(driver);
	}
	
	/*public void open(){
		
		driver.get("http://whiteboxqa.com/");
	}*/
	
	public int getsocialLinks()
		{
		
		int count = 0;
		List<WebElement> links = driver.findElements(sociallinks);
		
		if(links != null)
			count = links.size();
		return count;
			
	}
	
	public String clickLogin(){
		String url = null;
		
		driver.findElement(loginlink).click();
		url = driver.getCurrentUrl();
		
		return url;
		
	}
	
	
	
	

}
