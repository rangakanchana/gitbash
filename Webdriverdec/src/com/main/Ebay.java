package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/div[2]/div[1]/ul[1]/li[1]/a")).click();
		
		
/*WebElement one = driver.findElement(By.id("anchd"));
WebElement two = driver.findElement(By.id("anchd"));
Actions action = new Actions(driver);
action.clickAndHold(one).moveToElement(two).release(two).build().perform();*/




		
		
		
	}
	
	
	
	
	
	

}
