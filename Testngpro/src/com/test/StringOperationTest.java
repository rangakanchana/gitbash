package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.StringOperation;

public class StringOperationTest {
	@Test
public void method1(){
	String str = "I Can Do it";
	StringOperation s = new StringOperation();
	int expected = 4;
	int actual = s.countVowel(str);
	assertEquals(expected,actual);
	}
@Test
public void method2(){
	String str = "Sridhar123";
	StringOperation s = new StringOperation();
	int expected = 2;
	int actual = s.countVowel(str);
	assertEquals(expected,actual);
	}
@Test
public void method3(){
	String str = "SrEEraj@$%6";
	StringOperation s = new StringOperation();
	int expected = 3;
	int actual = s.countVowel(str);
	assertEquals(expected,actual);
	}
@Test
public void method4(){
	String str = " ";
	StringOperation s = new StringOperation();
	int expected = 0;
	int actual = s.countVowel(str);
	assertEquals(expected,actual);
	}
@Test
public void method5(){
	String str = "123456";
	StringOperation s = new StringOperation();
	int expected = 0;
	int actual = s.countVowel(str);
	assertEquals(expected,actual);
	}
}
