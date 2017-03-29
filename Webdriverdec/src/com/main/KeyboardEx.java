package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardEx {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		
		//enter the data in the first tab
		driver.findElement(By.xpath(".//*[@id='_dKg']")).sendKeys("Selenium");
		
		//select the data from the first tab
		driver.findElement(By.xpath(".//*[@id='_dKg']")).sendKeys(Keys.CONTROL+"a");
		
		//copy the data from that tab
		driver.findElement(By.xpath(".//*[@id='_dKg']")).sendKeys(Keys.CONTROL+"c");
		
		//paste the data to the next tab
		driver.findElement(By.xpath(".//*[@id='_bKg']")).sendKeys(Keys.CONTROL+"v");
		

		
		
		
		
		
	}
	
	
	
	
	
	

}
