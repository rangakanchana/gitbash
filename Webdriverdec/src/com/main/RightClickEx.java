package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
WebElement element = driver.findElement(By.className("_Gs"));
Actions actions = new Actions(driver);
actions.contextClick(element).build().perform();
actions.sendKeys("t").perform();


	}

}
