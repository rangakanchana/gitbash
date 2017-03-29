package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys("admina");   //-ve testcase
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	
	//verifying the actual and expected url
	/*String url = driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("adminlogin successful----passed");
	}else{
		System.out.println("adminlogin unsuccessful----failed");
		}
		driver.close();*/
	//capturing the error message and compare it
	String errormessage = driver.findElement(By.className("messageStackError")).getText();
	if(errormessage.contains(" Error: Invalid administrator login attempt.")){
		System.out.println("handled the error-----passed");
	}else{
			System.out.println("unhandled the error----failed");
		}
	}
    }

