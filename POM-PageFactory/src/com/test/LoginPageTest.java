package com.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.LoginPage;


public class LoginPageTest extends BaseTest {
	
	LoginPage lp;
	 
	@BeforeClass
	public void beforeClass(){
		
		lp= new LoginPage(driver);
		
		lp = PageFactory.initElements(driver, LoginPage.class);
		
		
	}
	@Test(priority=1)
	public void testLoginLink(){
		
	Assert.assertEquals("Login",lp.clicklogin());
	
	}
	@Test(priority=2)
	public void testLogin(){
		
    Assert.assertEquals("You have not registered.", lp.login("test123", "test"));
    
	}
	@Test(priority=3)
	public void testForgotPass(){
		
		Assert.assertTrue(lp.forgotPassword());
	}
	@AfterClass
	public void afterClass(){
		
		driver.close();
	}

}
