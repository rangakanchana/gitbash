package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest{
	
	HomePage hp;
	 
	@BeforeClass
	public void beforeClass(){
		
		hp= new HomePage(driver);
		
		 hp = PageFactory.initElements(driver, HomePage.class);

		
	}
	@Test
	public void testSocialIcons(){
		
	Assert.assertEquals(4, hp.countSocialIcons());
	
	}
	@Test
	public void testSocialTabs(){
		
	Assert.assertEquals(8, hp.countSocialTabs());		

    }
	
	@Test
	public void isEnrollPresent(){
		
	Assert.assertTrue(hp.isEnrollPresent());	
	}
}
