package com.array;

import java.util.LinkedHashSet;

public class LinkedHashsetExample {
		int id;
		String name;
		public  LinkedHashsetExample(int id,String name)
		{
			this.id = id;
			this.name=name;
			}

public static void main(String[] args) {
	
	LinkedHashsetExample s1 = new LinkedHashsetExample(1,"radha");
	LinkedHashsetExample s2 = new LinkedHashsetExample(2,"gita");
	LinkedHashsetExample s3 = new LinkedHashsetExample(3,"prabha");
	LinkedHashsetExample s4 = new LinkedHashsetExample(4,"rina");
//creation of linkedhashset
	LinkedHashSet<LinkedHashsetExample> set = new LinkedHashSet<LinkedHashsetExample>();
	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
//retrival elements from linkedhashset
	for(LinkedHashsetExample hash : set){
		System.out.println("the id is  " + hash.id);
		System.out.println("the name is "+ hash.name);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
	

}
