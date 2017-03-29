package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class SetExample {
	//static void setExample(){
		//creation of hashset
		HashSet<String> set = new HashSet<String>();
		/*set.add("radha");
		set.add("usha");
		set.add("geetha");
		set.add("null");
		set.add("rina");
		set.add("null");
		set.add("radha");*/
		
//retriving elements from hashset
		/*for(String s : set){
			System.out.println(s);
		}*/
		//reriving elements from iterator
		/*Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		}*/
	public static void main(String[] args) {
		//SetExample.setExample();
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set1 = new HashSet<>();
		
		list.add("geetha");
		list.add("prabha");
		list.add("prabha");
		list.add("geetha");
		list.add("kanchana");
		list.add("kanchana");
		list.add("rina");
		list.add("rina");
		//if we want to delete duplicates from arraylist,first we want to replace elements to set and so ....
		set1.addAll(list);
		list.clear();
		list.addAll(set1);
		//retriving elements from iterator
		Iterator<String>it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

		
		
		
		
		
	
		
		
		
	}

}
