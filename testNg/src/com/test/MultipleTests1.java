package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTests1 {
	
@BeforeMethod
public void logIn(){
	System.out.println("login successful");
}
@Test
public void deleteProduct(){
	System.out.println("delete product successful");
}
@Test
public void deleteCurrency(){
	System.out.println("delete currency successful");
}
@Test
public void deleteVendor(){
	System.out.println("delete vendor  successful");
}
@AfterMethod
public void logout(){
	System.out.println("logout successful");
}
}