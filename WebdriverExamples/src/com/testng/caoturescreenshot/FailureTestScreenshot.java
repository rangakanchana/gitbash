/**
 * 
 */
package com.testng.caoturescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 *we  have to take screen shot for failure testcases
 * for that we need to take help of ITestResult Interface
 * this ITestResult object(result) will have the info of all the testcases
 * 
 * @author sridhar
 *
 */
public class FailureTestScreenshot {
	
	WebDriver driver;
	
	@Test
	public void facebookscreen(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//forcefully giving wrong xpath to fail the testcase
		driver.findElement(By.id("emai")).sendKeys("kanchana");
	}
	
	@AfterMethod
	public void teardown(ITestResult result){
		
	if(ITestResult.FAILURE==result.getStatus()){
		
		//here i need to store the screenshot by testcase name
		 UtilityForScreenshots.screenshot(driver, result.getName());
		 driver.quit();
		 
	}
		
		
		
		
		
	}
	

}
