package com.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileEx {

	public static void main(String[] args) throws InterruptedException, AWTException {
 WebDriver driver = new FirefoxDriver();
 driver.get("https://www.google.com");
 
 driver.manage().window().maximize();
 
 //enter the text in google search box
 driver.findElement(By.id("lst-ib")).sendKeys("java download");
 
 //click enter option with keyboard functions
 driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
 Thread.sleep(3000);
 
 //click the download java hyperlink
 driver.findElement(By.linkText("Download Free Java Software")).click();
 Thread.sleep(3000);

 //click the free java download box
 driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
 Thread.sleep(3000);

 //click the agree and start free download
 driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
 Thread.sleep(3000);

 //here we got a window based popup, using Robot Api we can handle this popup
 //create robot class object
 //handling window based popup
 
 Robot robotobj = new Robot();
 robotobj.keyPress(KeyEvent.VK_TAB);
 Thread.sleep(3000);

 
 //click enter
 robotobj.keyPress(KeyEvent.VK_ENTER);
 
 
 
 
 
		
		
		
		
		
	}

}
