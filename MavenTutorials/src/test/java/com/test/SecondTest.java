package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SecondTest {
@Test

//click on the selenium web browser link
public void tc_3(){
	
	FirstTest.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	FirstTest.driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	
}

}
