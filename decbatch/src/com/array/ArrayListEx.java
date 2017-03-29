package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	int id;
	String name;
	 public ArrayListEx(int id,String name)
	 {
		 this.id = id;
		 this.name = name;
	}
public static void main(String[] args) {
	ArrayListEx a1 = new ArrayListEx(1,"Radha");
	ArrayListEx a2 = new ArrayListEx(2,"Usha");
	ArrayListEx a3 = new ArrayListEx(3,"Revathi");
	
	ArrayList<ArrayListEx> l = new ArrayList<ArrayListEx>();
l.add(a1);
l.add(a2);
l.add(a3);
/*for(ArrayListEx x: l){
	System.out.println(" the id is "+ x.id);
	System.out.println("the name is "+ x.name);
	
}*/
/*Iterator<ArrayListEx> itr = l.iterator();
while(itr.hasNext()){
	ArrayListEx x = itr.next();
	System.out.println(" the id is "+ x.id);
	System.out.println("the name is "+ x.name);
	}*/
//to retrieve only 2 elements from for each loop
int count = 0;
for(ArrayListEx x :l){
	if(count > 1){
		break;
		}
	count++;
	System.out.println(" the id is "+ x.id);
	System.out.println("the name is "+ x.name);
	}
	


	
}
}
