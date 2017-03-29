package com.testng.caoturescreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WhiteboxScreenshot {
	
	
	@Test 
	public void screenShotforWhitebox(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		UtilityForScreenshots.screenshot(driver, "openpage");
		
		driver.findElement(By.id("loginButton")).click();
		UtilityForScreenshots.screenshot(driver, "clickloginlink");
		
		driver.findElement(By.id("username"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("login")).click();
		
		UtilityForScreenshots.screenshot(driver, "clickloginpage");

}

}
