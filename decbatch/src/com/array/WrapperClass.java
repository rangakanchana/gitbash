package com.array;

public class WrapperClass {
	public static void main(String[] args) {
	//primitive to wrapper	
		int a = 30;
		Integer b = Integer.valueOf(a);
	Integer i = a;//autoboxing
	
	//wrapper to primitive
	
	Integer j = new Integer(20);
	int j1 = j.intValue();
	int k = j;//unboxing
	
	
	
	}
}
