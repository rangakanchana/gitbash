package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.StringOperation;

public class StringOperationTest1 {
	@Test
	public void method1(){
		String str = "rwqtry";
		StringOperation s = new StringOperation();
		int expected = 0;
		int actual = s.countVowel(str);
		assertEquals(expected,actual);
		}
	@Test(expectedExceptions = NullPointerException.class)
	public void method2(){
		String str = null;
		StringOperation s = new StringOperation();
		int expected = 0;
		int actual = s.countVowel(str);
		assertEquals(expected,actual);
		}
	}
