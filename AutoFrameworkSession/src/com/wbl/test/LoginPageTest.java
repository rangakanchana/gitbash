package com.wbl.test;


import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;

import com.wbl.common.CommonTest;
import com.wbl.page.LoginPage;
import com.wbl.pageflow.LoginPageFlow;

public class LoginPageTest extends CommonTest {
	
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass(){
		
		lp= new LoginPage(driver);
		LoginPageFlow.gotoLogin(driver);
	}
public void testLogin(){
	assertEquals("QA/QE/SDET Training.",lp.login());
}
public void testForgotPass(){
	assertTrue(lp.forgotpass());
}
public void testBreadcrumbs(){
	assertEquals(3,lp.countBreadcrumbs());
}


}
