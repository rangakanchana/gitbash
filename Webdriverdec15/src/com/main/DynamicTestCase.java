package com.main;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTestCase {
	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
driver.findElement(By.xpath(".//*[@id='usernameId']")).sendKeys("gcreddy7");
driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("gld938");

//to find captcha values(dynamic input) create scanner object

Scanner scan = new Scanner(System.in);
System.out.println("Enter the Captcha");
String captcha = scan.nextLine();

driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
String url = driver.getCurrentUrl();

//verification--for current url(before and after login)

if(url.equals("https://www.irctc.co.in/eticketing/home")){
	System.out.println("Login successful-passed");
	}else{
		System.out.println("Login unsuccessful-failed");
}
scan.close();
driver.close();
}
}
