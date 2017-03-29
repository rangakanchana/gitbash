package com.wbl.test;
import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.common.CommonTest;
import com.wbl.page.HomePage;

public class HomePageTest extends CommonTest{
	
	HomePage hp;
	@BeforeClass
	public void beforeClass(){
		
		hp = new HomePage(driver);
		
	}
	@Test
	public void testSliders(){
		
		assertEquals(6,hp.countSliders());
	}
	
	
	@Test
	public void testVideoPresent(){
		assertTrue(hp.videoPresent());
	}
	@Test
	public void testSectionHeaders(){
		assertTrue(hp.sectionHeaders());
	}
	

}
