package com.array;

import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListEx {
	
public static void 	Llist(){
	LinkedList<String> list = new LinkedList<String>();
	list.add("kanchana");
	list.add("geetha");
	list.add("rina");
	list.add("prabha");
	list.set(2, "chandana");
	//list.removeLast();
	/*for(String s : list){
		System.out.println(s);}*/
	ListIterator<String> it = list.listIterator(list.size());
	while(it.hasPrevious()){
		
	System.out.println(it.previous());	
    }
	}
	public static void main(String[] args) {
		
		LinkedListEx.Llist();
		
	}

}
