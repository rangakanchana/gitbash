package com.array;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {
	
	public static void main(String[] args) {
		//creation of treeset
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Geetha");
		ts.add("prabha");
		ts.add("rina");
		ts.add("neelam");
		ts.add("Geetha");
		ts.add("null");
		ts.add("aarti");
		ts.add("bharti");
		//retriving elements
		/*for(String s : ts){
			System.out.println(s);
		}
*/
		//by iterator
		Iterator<String>it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
				
		
		
		
	}
	

}
