/**
 * 
 */
package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

/**
 * first test case, enter the data on the google search box
 * @author sridhar
 *
 */

public class FirstTest {
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser){
		
	if(browser.equalsIgnoreCase("firefox")){
			
	driver = new FirefoxDriver();
   }
	else if(browser.equalsIgnoreCase("chrome")){
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
		
			
		}
	}
	
	
	@Test
	public void tc_1(){
		
	
	driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	}
	//click on enter option
	
	@Test
	public void tc_2(){
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
	
	
	
	
	
	
	
	

}
