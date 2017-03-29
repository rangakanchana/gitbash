package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.StringOperations;


public class StringOperationsTest {
	@Test
	
	
	public void method1(){
		
	
	String str = "sridhar";
	StringOperations op = new StringOperations();
	int expected = 2;
	int actual = op.countVowels(str);
	assertEquals (expected,actual);
}
	@Test
	
	public void method2(){
String str = "sridhar&%$_goud";
StringOperations op = new StringOperations();
int expected = 4;
int actual = op.countVowels(str);
assertEquals(expected,actual);
}
	@Test
	public void method3(){
		String str = "sridhar1234goud";
		StringOperations op = new StringOperations();
		int expected = 4;
		int actual = op.countVowels(str);
		assertEquals(expected,actual);
		}
	@Test
	public void method4(){
		String str = "SriDhar Goud";
		StringOperations op= new StringOperations();
		int expected = 4;
		int actual = op.countVowels(str);
		assertEquals(expected,actual);
		}
	@Test
	public void method5(){
		String str = "";
		StringOperations op = new StringOperations();
		int expected = 0;
		int actual = op.countVowels(str);
		assertEquals(expected,actual);
}
	@Test(expectedExceptions= NullPointerException.class)
	public void method6(){
		String str = null;
		StringOperations op =new StringOperations();
		int expected = 0;
		int actual = op.countVowels(str);
		assertEquals(expected,actual);
	}
}
