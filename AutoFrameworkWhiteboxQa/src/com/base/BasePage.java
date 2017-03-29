package com.base;


import com.util.PageDriver;

public abstract class BasePage {
	
	public PageDriver driver;
	//pass the webdriver object through the constructor,no need to create driver again
	
	public BasePage(PageDriver driver){
		
		this.driver = driver;
	}

}
