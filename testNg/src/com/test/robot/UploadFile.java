package com.test.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	WebDriver driver;
	
	@Test
	public void uploadFile() throws AWTException{
		
		driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("imagesrc")).click();
		
		Robot robot = new Robot();
		
		robot.setAutoDelay(3000);
		
		StringSelection selectionpath = new StringSelection("C:\\Users\\sridhar\\Desktop\\whiteboxtesting.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectionpath, null);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);

		robot.keyRelease(KeyEvent.VK_CONTROL);		
		
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		}

}
