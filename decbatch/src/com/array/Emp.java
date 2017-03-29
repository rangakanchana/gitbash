package com.array;

public class Emp implements Comparable<Emp> {
	
	int eid;
	String ename;
	Emp(int eid,String ename){
		this.eid = eid;
		this.ename = ename;
		}
	//override compareTo() method to sorting with eid
	public int compareTo(Emp e){
		if(eid==e.eid){
			return 0;
		}else if(eid>e.eid){
			return 1;
		}else{
			return -1;
		}
	}
	//override compareTo() method to sorting with ename
	/*public int compareTo(Emp e){
		return ename.compareTo(e.ename);*/
		
		
	}
	

	
	


