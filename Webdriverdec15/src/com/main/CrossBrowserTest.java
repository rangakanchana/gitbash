package com.main;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {
	
	
	public static void main(String[] args) {
		
	/*WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	String PageTitle = driver.getTitle();
	if(PageTitle.equals("Google")){
		System.out.println("Google page is launched---passed");
	}else{
		System.out.println("Google page is not launched---failed");
    }
	driver.close();*/
	//in chrome browser;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
String PageTitle = driver.getTitle();
if(PageTitle.equals("Google")){
	System.out.println("Google page is launched---passed");
}else{
	System.out.println("Google page is not launched---failed");
}
driver.close();
		//internet explorer
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\sridhar\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		String PageTitle = driver.getTitle();
		if(PageTitle.equals("Google")){
			System.out.println("Google page is launched---passed");
		}else{
			System.out.println("Google page is not launched---failed");
		}
		driver.close();*/
		
}
}
