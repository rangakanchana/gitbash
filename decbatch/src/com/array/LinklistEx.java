package com.array;

import java.util.LinkedList;

import com.test.java.MainClass;

public class LinklistEx {
	static void linklistExample(){
		//creation of linkedlist
	LinkedList<String> list = new LinkedList<String>();
	list.add("kanchana");
	list.add("bharti");
	list.add("geetha");
	list.add("100");
	list.add("rina");
    list.add("prabha");
	list.add("kanchana");
//retrieving elements
	for(String s : list){
		System.out.println(s);
	}
	}
	
public static void main(String[] args) {
	LinklistEx.linklistExample();
	
}
}
