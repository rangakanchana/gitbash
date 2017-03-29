package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		if(url.contains("wikipedia.org")){
			System.out.println("the link is internal link - redirected to another page in the same application--passed");
		}else{
			System.out.println("the link is external link - redirected to another page in the other application--failed");
			}  
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		if(! url.contains("wikipedia.org")){
			System.out.println("the link is external link - redirected to another page in the other application--passed");
	}else{
		System.out.println("the link is internal link - redirected to another page in the same application--failed");
	}
		driver.close();
	}
	}
