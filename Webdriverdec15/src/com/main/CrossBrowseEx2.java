package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowseEx2 {
	public static WebDriver driver;
	public static int browser;
	public static String browsername;
	public static void main(String[] args) {
		
		for(browser = 1;browser <= 3;browser++){
			if(browser == 1){
				 driver = new FirefoxDriver();
				browsername = "Mozilla Firefox Browser :";
        }else if(browser == 2){
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\cromedriver.exe");
   		 driver = new ChromeDriver();
			browsername = "Google Chrome Browser :";

        }else if(browser == 3){
        	 System.setProperty("webdriver.ie.driver", "C:\\Users\\sridhar\\IEDriver.exe");
    		 driver = new InternetExplorerDriver();
				browsername = "Internet Explorer Browser :";

        }
			driver.get("https://www.google.com");
			String PageTitle = driver.getTitle();
			if(PageTitle.equals("Google")){
				System.out.println(browsername +"the google page launched---passed");
			}else{
				System.out.println(browsername +"the google page is not launched---failed");
	}
			driver.close();	
		}
		}
        }
