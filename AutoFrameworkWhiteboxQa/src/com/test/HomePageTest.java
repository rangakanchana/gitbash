package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest{
	
	HomePage hp;
	@BeforeClass
	public void beforeClass(){
		
		hp = new HomePage(driver);
	
	}
	@Test
	public void testSocialLinks(){
		
		assertEquals(4,hp.getsocialLinks());
		
	}
	@Test
	public void testLoginLink(){
		
		assertEquals("http://whiteboxqa.com/login.php",hp.clickLogin());
		
	}
	
	
	
	

}
