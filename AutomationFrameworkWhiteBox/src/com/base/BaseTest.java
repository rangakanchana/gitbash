package com.base;

import org.testng.annotations.BeforeSuite;
import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

//everything common to test in entire suite will go into basetest
public abstract class BaseTest {

	//config properties should be final for test
	public static final Configuration config;
	
	//it executes before everything else
	static{
		config = new Configuration();
	}
	public PageDriver driver;

	
	@BeforeSuite
	public void initialize(){
		driver = new PageDriver(config);
		Locators.getElements();
	}
	
	
	
	

}
