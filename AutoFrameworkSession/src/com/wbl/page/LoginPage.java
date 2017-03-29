package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends PortalPage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
public String login(){
	driver.findElement(By.id("username")).sendKeys("test123");
	driver.findElement(By.id("password")).sendKeys("test");
	driver.findElement(By.id("login")).click();
	return driver.getTitle();
	//return driver.findElement(By.xpath("//*[text()='You have not registered.']"));

}
public int countBreadcrumbs(){
	return driver.findElements(By.cssSelector(".breadcrumbs.pull-right li")).size();
}
public boolean forgotpass(){
	driver.findElement(By.cssSelector("#forgotpassword")).click();
	return driver.findElement(By.id("email")).isDisplayed();
}

}
