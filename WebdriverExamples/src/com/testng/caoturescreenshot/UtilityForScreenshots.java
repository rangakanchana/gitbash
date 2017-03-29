package com.testng.caoturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityForScreenshots {
	
	public static void screenshot(WebDriver driver,String screenshotname){
		try{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotname+".png"));
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("screenshot taken");
		}
		
		
		
	}


