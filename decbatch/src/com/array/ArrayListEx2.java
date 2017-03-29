package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2  {

	public static void main(String[] args) {
ArrayList<Emp> al = new ArrayList<Emp>();
al.add(new Emp(5,"kanchana"));
al.add(new Emp(2,"prabha"));
al.add(new Emp(8,"rina"));
al.add(new Emp(3,"nilam"));

Collections.sort(al);
for(Emp e:al){
	System.out.println("after sorting: "+e.eid+" "+e.ename);
}
//compare to string name
Collections.sort(al);
for(Emp e1:al){
	System.out.println("After sorting with ename:"+e1.ename+" "+e1.eid);
}
}
}
