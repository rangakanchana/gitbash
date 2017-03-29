package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.ExcelConfigLib.ConfigExcelData1;

public class ReadExcelFileTest {
	
	public WebDriver driver;
	
	@Test(dataProvider="wordpressdata")
	public void login(String username,String password){
		
		driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		
		driver.findElement(By.id("user_pass")).sendKeys(password);
		
		driver.findElement(By.id("wp-submit")).click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Assert.assertTrue(driver.getTitle().contains("DashBoard"),"user entered invalid credentials");
		
		System.out.println("test csse passed:::user enter valid credentials");
		
		}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name="wordpressdata")
	@Test
	public Object[][] getData(){
		
		ConfigExcelData1 _config = new ConfigExcelData1("C:\\Users\\sridhar\\workspace\\Webdriverdec\\ExcelData\\TestData.xlsx");
		
		int rows=_config.rowCount(0);
		
		Object[][]data = new Object[rows][2];
		
		for(int i =0;i<rows;i++){
			
			data[i][0]= _config.getData("inputdata1", i, 0);
			
			data[i][1]=_config.getData("inputdata1", i, 1);
			
		}
		return data;
		}
	
	
	
	
	

}
