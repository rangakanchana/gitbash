package DataDrivenTesting;
/*datadriven testing with 2 dimentional array
if we have testdata 3 or 4 sets,then we can go by this approach*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdtWithExcel {
	
	WebDriver driver;
	
	@Test(dataProvider="wordpressdata")
	public void wordpressLogin(String username,String password){
		
		driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
        Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Invalid credentials--user unable to login");		
		System.out.println("login page verified--user able to login successfully");
		}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	//for passingdata we need to create 2 dimentional object array
	
	@DataProvider(name="wordpressdata")
	public Object[][] passData(){
		
		ExcelConfig config = new ExcelConfig("C:\\Users\\sridhar\\workspace\\WebdriverExamples\\Exceldata\\wordpressdata.xlsx");
		
		int rows = config.rowCount(0);
		Object[][] data = new Object[rows][2];  //3 rows and 2 columns
	
		for(int i=0;i<rows;i++){
			
	    data[i][0]=config.getData(0, i, 0);	
	    data[i][1]=config.getData(0, i, 1);
		}
		
		return data;
		
	}

}
