package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.util.BrowserFactory;
import com.util.Configuration;

public abstract class BaseTest {
	
	Configuration config;
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeTest(){
		
	 config = new Configuration();
	
	driver = BrowserFactory.startBrowser(config);
	
	driver.get(config.getUrl());
	
	driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void afterTest(){
		
		driver.close();
	}

}
