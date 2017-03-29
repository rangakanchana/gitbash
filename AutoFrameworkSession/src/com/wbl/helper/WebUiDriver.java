package com.wbl.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUiDriver {
	
	//public static String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers\\";

	
	public static WebDriver getDriver(ConfigUtils config){
		
		WebDriver driver = null;
		switch(config.BROWSER){
		case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sridhar\\workspace\\AutoFrameworkSession\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
		case "chrome":
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\workspace\\AutoFrameworkSession\\resources\\drivers\\chromedriver.exe");
		break;
		case "ie":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\workspace\\AutoFrameworkSession\\resources\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
		break;
		case "html":
		driver = new HtmlUnitDriver();
		break;
		case "opera":
		System.setProperty("webdriver.opera.driver", "C:\\Users\\sridhar\\workspace\\AutoFrameworkSession\\resources\\drivers\\operadriver.exe");
        driver = new OperaDriver();	
		break;
		default:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\workspace\\AutoFrameworkSession\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();	

		}
		
		
		
		return driver;
	}

}
