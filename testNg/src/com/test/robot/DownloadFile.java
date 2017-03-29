package com.test.robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFile {
	
	WebDriver driver;
	
	@Test
	public void testUploadFile() throws Exception{
		
	driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("lst-ib")).sendKeys("download java");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.linkText("Download Free Java Software")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	driver.close();
		
	}
	
	

}
