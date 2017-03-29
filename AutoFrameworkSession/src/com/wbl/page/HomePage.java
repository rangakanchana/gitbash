package com.wbl.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PortalPage {

	public HomePage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public int countSliders(){
		
		return driver.findElements(By.cssSelector(".slides li")).size();
	}
	public void clickLogin(){
		driver.findElement(By.linkText("Login")).click();
	}
	public boolean sectionHeaders(){
		return driver.findElement(By.cssSelector(".line")).isDisplayed();
	}
    public boolean videoPresent(){
    	return driver.findElement(By.id("vid_1")).isEnabled();
    }
}
