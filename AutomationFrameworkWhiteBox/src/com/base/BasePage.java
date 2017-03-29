package com.base;


import com.util.PageDriver;

      public abstract class BasePage {
	
       public   PageDriver	driver;     
       //this is called dependency injection,passing the webdriver object through constructor

       public BasePage(PageDriver driver){
	
	   this.driver = driver;
	   
	   driver.getUrl("http://whiteboxqa.com/");
	   
		driver.maxBrowser();
	
}

}
