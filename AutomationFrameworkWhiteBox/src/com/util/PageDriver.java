package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class PageDriver  {
	WebDriver driver;
	Configuration configuration;
	
	public PageDriver(Configuration config){
		configuration = config;
		
		//driver = new FirefoxDriver();
	}
	public  void initializeBrowser(){
		String browser = Configuration.BROWSER;
		if(browser == "firefox"){
			startFirefox();
			
		}else if(browser == "chrome"){
			startChrome();
		}else if(browser == "ie"){
				srartIE();
	    }else
	    {
	    	startHTML();
	    }
		driver.get(Configuration.URL);
		}
	
	public void startFirefox(){
		driver = new FirefoxDriver();
	}
	public void startChrome(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
	}
	public void srartIE(){
	System.setProperty("webdriver.ie.driver", "C:\\Users\\sridhar\\jar files\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");	
		driver = new InternetExplorerDriver();
	}
	public void startHTML(){
		driver = new HtmlUnitDriver();
	}
	


	public void getUrl(String url){
		 driver.get(url);
	}
	
	public WebElement findElement(By by){
		return driver.findElement(by);
	}
	public List<WebElement> findElements(By by){
		return driver.findElements(by);
	}
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}
	public void maxBrowser(){
		 driver.manage().window().maximize();
	}
	public void quit(){
		driver.quit();
	}

}
