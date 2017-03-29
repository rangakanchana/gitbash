package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.common.CommonPage;

public class PortalPage extends CommonPage{

	public PortalPage(WebDriver driver) {
		super(driver);
	}
	public int socialIcons(){
		List<WebElement> elements = driver.findElements(By.cssSelector(".container .social-icons li"));
		return elements.size();
		}
	public boolean isLogoPresent(){
		return driver.findElement(By.cssSelector("#logo")).isDisplayed();
	}
	public int navigateBars(){
		List<WebElement> count = driver.findElements(By.xpath("//div[@id='navbar-collapse']/ul/li"));
		return count.size();
	}
	public boolean isFooterbarPresent(){
		return driver.findElement(By.id("footerbot")).isDisplayed();
	}

}
