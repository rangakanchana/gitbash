package com.testng.caoturescreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookScreenshot {
	
	WebDriver driver;
	
	@Test
	public void facebookScreen(){
		
	driver = new FirefoxDriver();	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("selenium advance");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src, new File("./Screenshots/facebook.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("screenshot taken");
	}
	}
