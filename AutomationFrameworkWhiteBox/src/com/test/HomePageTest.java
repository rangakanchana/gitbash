package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest{
	HomePage hp;
	@BeforeClass
	public void initialize(){
		hp= new HomePage(driver);
	}
	
	
	
	@Test
	public void testSocialLinks(){
		int actual = hp.scoialIcons();
		assertEquals(actual,4);
	}
	@Test
	public void testLoginLink(){
		assertEquals("http://www.whiteboxqa.com/login.php",hp.clickLogin());
	
	}
	@AfterClass
	public void quit(){
		driver.quit();
	}
	
	
	
	
	

}
