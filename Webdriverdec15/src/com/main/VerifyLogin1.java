package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin1 {
	static int i;
	static String username,password,iteration;

	public static void main(String[] args)  {
WebDriver driver = new FirefoxDriver();
for(i=1;i<=2;i++){
	if(i==1){
		username = "admin";
		password = "admin@123";
		iteration = "Iteration 1: ";
	}else if(i==2){
		username = "admina";
		password = "admin@123a";
		iteration = "Iteration 2: ";
	}
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.xpath(".//*[@id='contentText']/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input")).sendKeys(username);
	driver.findElement(By.xpath(".//*[@id='contentText']/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td/input")).sendKeys(password);
	driver.findElement(By.xpath(".//*[@id='tdb1']")).click();
	
String url = driver.getCurrentUrl();
if(url.contains("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println(iteration + ("input data: ")+ username +","+password +","+ "adminlogin successful----passed");
	driver.findElement(By.linkText("Logoff")).click();
	
}
else if(! url.contains("http://www.gcrit.com/build3/admin/index.php")){
String errormessage = driver.findElement(By.className("messageStackError")).getText();
if(errormessage.contains("Error: Invalid administrator login attempt")){
	System.out.println(iteration +("input data: "+ username +","+ password+"," +"handled invalid inputs ----passed"));
}else {
	System.out.println(iteration+ "-failed");
}
}
}
driver.close();
}
}
