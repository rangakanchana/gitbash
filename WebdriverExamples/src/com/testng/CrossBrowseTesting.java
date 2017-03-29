package com.testng;

import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowseTesting {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void setUp(String browser){
		
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sridhar\\jar files\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	    }*/
	
		driver.get("http://learn-automation.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='tve_editor']/div[2]/div[4]/div[2]/p/font/span/a")).click();
		String parentwindow = driver.getWindowHandle();
		for(String childwindow:driver.getWindowHandles()){
			
			driver.switchTo().window(childwindow);
		}
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Read Excel file in Selenium using JExcel API")).click();
		assertEquals("http://learn-automation.com/read-excel-file-in-selenium-using-jexcel/",driver.getCurrentUrl());
	
	    driver.quit();
}
	

}
