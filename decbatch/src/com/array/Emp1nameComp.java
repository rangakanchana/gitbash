package com.array;

import java.util.Comparator;

public class Emp1nameComp implements Comparator<Emp1> {
	//override compare() method to sort by comparator interface
	
	public int compare(Emp1 e1,Emp1 e2){
		return (e1.ename).compareTo(e2.ename);
	}

}
