package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegistration {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("kanchana");
		WebElement  lastname = driver.findElement(By.name("LastName"));
		lastname.sendKeys("ranga");
		WebElement username = driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
		username.sendKeys("rangakanchana103");
		WebElement pass = driver.findElement(By.id("Passwd" ));
		pass.sendKeys("Bikshu123");
		driver.findElement(By.id("submitbutton"));
				
				
		
		
	}
	

}
