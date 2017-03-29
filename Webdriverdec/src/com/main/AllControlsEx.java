package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AllControlsEx {
	

	public static void main(String[] args) {
//launching the browser
	WebDriver driver = new FirefoxDriver();
	
//maximize the browser
	driver.manage().window().maximize();
//enter the url
	driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");


//handelling hyperlink
driver.findElement(By.linkText("Selenium Practice page")).click();

//handling text box
//driver.findElement(By.name("Name")).sendKeys("Selenium");

//handelling check box
driver.findElement(By.name("subscribe")).click();

//handelling dropdown,for that we need to takehelp of SELECT class 
new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Albania");

//handling radio button selecting 3rd button (bad)
driver.findElement(By.xpath(".//*[@id='sampleform']/table/tbody/tr[7]/td/input[3]")).click();

//handling submit button
driver.findElement(By.xpath(".//*[@id='sampleform']/table/tbody/tr[9]/td/input")).click();
	
	
		
		
		
		
		
	}

}
