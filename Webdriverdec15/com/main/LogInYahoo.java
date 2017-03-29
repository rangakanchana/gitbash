package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInYahoo {
	public static void main(String[] args) {
		WebDriver  driver = new FirefoxDriver();
driver.get("https://www.yahoo.com/");
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("login-username")).sendKeys("abcd");
driver.findElement(By.tagName("button")).click();
driver.findElement(By.tagName("input")).sendKeys("ancd");
driver.findElement(By.linkText("Sign in")).click();




		
		

	}
	

}
