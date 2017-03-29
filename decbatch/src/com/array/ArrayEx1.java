package com.array;

import java.util.ArrayList;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		//conversion of array to collection framework
		
	/*	String[] s = {"ratan","kanchana","prabha","rina"};
		
		// Arrays.asList() method;
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		
		//for retriving data for each loop
		for(String str:al){
			System.out.println(str);
		}*/
	//conversion from collections to arrays
	//generic version of Arraylist
		//use toArray() method 
		
	ArrayList<String>al1 = new ArrayList<String>();
	
	al1.add("ratan");
	al1.add("kanchana");
	al1.add("prabha");
	al1.add("rina");
	//create string array
	String[] s1 = new String[al1.size()];
	al1.toArray(s1);
	// for retriving data
	
	for(String ss:al1){
		System.out.println(ss);
	}
	//without generics
	
	ArrayList al2 = new ArrayList();
	al2.add(10);
	al2.add("ratan");
	al2.add(20);
	Object[] o =al2.toArray();
	for(Object o1:o){
		System.out.println(o1);
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
