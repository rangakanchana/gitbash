package com.main;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsEx {

	public static void main(String[] args) throws InterruptedException {

	//launch the browser
		WebDriver driver = new FirefoxDriver();
	driver.get("http://www.hdfcbank.com/");	
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );



	
	//click the credit card link in parent window
	driver.findElement(By.linkText("Credit Card")).click();
	Thread.sleep(2000);
	
	//click the new customer link in new tab(child window)
	//for that we use getWindowHandle(),getWindowHandles() functions
	String parentwindow=driver.getWindowHandle();
	
	//for new window we use the other command
	Set<String> child = driver.getWindowHandles();
	
	//since it is set of strings,we need to use foreach loop
	for(String childwindow:child){
		driver.switchTo().window("childwindow");
	}
		
	
		
		
		
	}

}
