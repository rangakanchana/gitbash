package com.main;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.Select;

public class APIExamples {
	
public static void alertsEx() throws InterruptedException{
/*WebDriver driver = new FirefoxDriver();
driver.get("http://softwaretesting-guru.blogspot.in/p/blog-page.html");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("html/body/div[3]")).sendKeys(Keys.PAGE_DOWN);
driver.findElement(By.tagName("input")).click();

Alert alert = driver.switchTo().alert();
alert.accept();*/
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().window().maximize();
	// This step will result in an alert on screen
	driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();

	Alert simpleAlert = driver.switchTo().alert();
	String alertText = simpleAlert.getText();
	System.out.println("Alert text is " + alertText);
	simpleAlert.accept();
    	
        		
}	
public static void actionsEx(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.ebay.com/");
	driver.manage().window().maximize();
	WebElement element= driver.findElement(By.xpath(".//*[@id='gh-ac']"));
	Actions action = new Actions(driver);
	action.moveToElement(element).click()
	.keyDown(element, Keys.SHIFT)
	.sendKeys("ipad")
	.keyUp(element, Keys.SHIFT)
	.doubleClick(element)
	.build().perform();
}
public static void actionsEx1(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions act = new Actions(driver);
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	//act.dragAndDrop(from, to).build().perform();
	act.clickAndHold(from).moveToElement(to).release(to).build().perform();
}
public static void optionsEx(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/");
	System.out.println(	driver.manage().getCookieNamed("PHPSESSID"));
	Cookie cookie = new Cookie("Wb", "Decbatch");
driver.manage().addCookie(cookie);
System.out.println(	driver.manage().getCookieNamed("Wb"));

Logs log = driver.manage().logs();
LogEntries logentries = log.get(LogType.DRIVER);
for(LogEntry logentry:logentries){
	System.out.println(logentry.getMessage());
}
}
//Create a new instance of the Firefox driver
public static void windowHandle(){
	WebDriver driver = new FirefoxDriver();

//driver = new FirefoxDriver();

// Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Launch the URL

driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

// Store and Print the name of the First window on the console

String handle= driver.getWindowHandle();

System.out.println(handle);

// Click on the Button "New Message Window"

driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();

// Store and Print the name of all the windows open	              

Set handles = driver.getWindowHandles();

System.out.println(handles);

// Pass a window handle to the other window

for (String handle1 : driver.getWindowHandles()) {

	System.out.println(handle1);

	driver.switchTo().window(handle1);

	}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Closing Pop Up window

//driver.close();

// Close Original window

//driver.quit();

}

public static void screenShot(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/");	
	driver.manage().window().maximize();

File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screen, new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\screenshot.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	

	
	
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		//APIExamples.alertsEx();	
		//APIExamples.actionsEx();
		//APIExamples.actionsEx1();
		APIExamples.windowHandle();
		//APIExamples.optionsEx();
		//APIExamples.screenShot();
		
		
		
		
}

}
