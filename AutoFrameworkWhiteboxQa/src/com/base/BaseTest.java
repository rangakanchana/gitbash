package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {
	
	public static final Configuration config;
	
	static
	{
		config = new Configuration();
	}
		 public PageDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		this.driver = new PageDriver(config);
		Locators.readLocators();
	}
	@AfterSuite
	public void afterSuite(){
		
		driver.quit();
	}

}
