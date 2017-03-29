package com.wbl.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.wbl.helper.ConfigUtils;
import com.wbl.helper.WebUiDriver;

public abstract class CommonTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		
		/*String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers";
		System.setProperty("webdriver.chrome.driver", LOCATION+"\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://whiteboxqa.com/");*/
		ConfigUtils config = new ConfigUtils("config.properties");
		
		driver = WebUiDriver.getDriver(config);
		driver.get(config.URL);
		}
	
	    }
