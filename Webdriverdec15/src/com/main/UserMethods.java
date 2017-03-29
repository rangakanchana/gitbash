package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserMethods {
	//user method for launch the browser
	public static  WebDriver driver;
public  void launchBr(){
	driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
}
//method for admin login without parameters with valid inputs

public void adminLogin(){
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
}
//method for admin login with parameters for negative inputs

public void adminLogin(String username,String password){
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("tdb1")).click();
}

//method for closing the browser

public void closeBr(){
	if(! driver.toString().contains("null")){
	driver.close();
}
}
}


