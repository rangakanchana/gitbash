package com.array;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
//treeset is having StringBuffer data, performing sorting
		
		TreeSet t = new TreeSet(new MyComp());
		t.add(new StringBuffer("ratan"));
		t.add(new StringBuffer("anu"));
		t.add(new StringBuffer("durga"));
		t.add(new StringBuffer("ravi"));
		System.out.println(t);

		
		
		
		
	}

}
