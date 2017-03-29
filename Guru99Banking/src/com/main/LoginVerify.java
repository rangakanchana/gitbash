package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginVerify {
	public static WebDriver driver;
	public static String baseurl;
	
	public static void setUp() throws Exception{
	driver = new FirefoxDriver();
	
		baseurl = UtilEx.BASE_URL;
	driver.get(baseurl);
	driver.manage().timeouts().implicitlyWait(UtilEx.WAIT_TIME, TimeUnit.SECONDS);

	}
	
	public static void main(String[] args) throws Exception{
		String actualTitle;
		
	LoginVerify.setUp();
	
	driver.findElement(By.name("uid")).clear();//good proactice to clear field before use
	driver.findElement(By.name("uid")).sendKeys(UtilEx.USERNAME);
	
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(UtilEx.PASSWORD);
	
	driver.findElement(By.name("btnLogin")).click();
	driver.manage().timeouts().implicitlyWait(UtilEx.WAIT_TIME, TimeUnit.SECONDS);

	
	actualTitle = driver.getTitle();
	
	//verification of title
	if(actualTitle.contains(UtilEx.EXPECT_TITLE)){
		
		System.out.println("testcase is passed");
	}
	else{
		System.out.println("testcase is failed");
	}
	}
	}
