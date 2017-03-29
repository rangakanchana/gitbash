package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleTests {
	
@BeforeClass
public void Login(){
	System.out.println("login successful");
}
@AfterClass
public void logOut(){
	System.out.println("logout successful");
}
@Test(priority=1)
public void addVendor(){
	System.out.println("added vendor successful");
}
@Test(priority=2)
public void addProduct(){
System.out.println("added product successful");	
}
@Test(priority=3)
public void addCurrency(){
	System.out.println("added currency successful");
}
}	
	
	
	

