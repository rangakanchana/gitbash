package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		String baseurl = "http://demo.guru99.com/V4/";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.findElement(By.name("uid")).sendKeys("mngr43831");
		driver.findElement(By.name("password")).sendKeys("EqabUra");
		driver.findElement(By.name("btnLogin")).click();

	}
	}
