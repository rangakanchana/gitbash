package com.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerForRedBus {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//div[@class='modalCloseSmall']")).click();
		
		driver.findElement(By.xpath("//input[@class='XXinput calendar']")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table[0]//td"));
		
		int total_nodes = dates.size();
		
		for(int i=0;i<total_nodes;i++){
			
		String date = dates.get(i).getText();
		
		if(date.equalsIgnoreCase("31")){
			
			dates.get(i).click();
			
			break;
		}
		}
		}
}
