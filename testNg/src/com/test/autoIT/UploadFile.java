package com.test.autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	WebDriver driver;
	
	@Test
	public void uploadFileByAutoIT() throws IOException{
		
	driver = new FirefoxDriver();
	
	driver.get("file:///C:/Users/sridhar/Desktop/fileupload.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("1")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	Runtime.getRuntime().exec("C:\\Users\\sridhar\\Desktop\\AutoIT\\fileupload.exe");
		
		
	}

}
