package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import com.base.BaseTest;
import com.page.HomePage;
import com.page.LoginPage;

public class LoginPageTest extends BaseTest{
	
	LoginPage lp;
	HomePage hp;
	
	public void initialize(){
		hp = new HomePage(driver);
		hp.clickLogin();
		lp = new LoginPage(driver);
	}
	@DataProvider(name = "user-data")
	public Object[][] getData(){
		
		Object[][] data = {{"ranga","ranga123"},{"suriya","suriya123"}};
		return data;
		}
	@Test(dataProvider = "user-data")
	public void testInvalidLogin(String uName,String pwd){
		
		String actual = lp.performLogin(uName, pwd);
		
		assertEquals("You have not registered.",actual);
		}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}

}
