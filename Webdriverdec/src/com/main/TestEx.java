package com.main;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEx {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://whiteboxqa.com/");
driver.findElement(By.cssSelector("#headerfblogin")).click();
String parent = driver.getWindowHandle();
Set<String> handles = driver.getWindowHandles();
for(String s1:handles){
	if(!s1.equals(parent)){
		driver.switchTo().window(s1);
	}
	}
driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
driver.findElement(By.id("pass")).sendKeys("abcde");




	}

}
