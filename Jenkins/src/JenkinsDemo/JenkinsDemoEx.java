package JenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemoEx {
	
	@Test
	public void jenkinsex(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
	}

}
