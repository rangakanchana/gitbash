package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(new Emp1(5,"kanchana"));
		al.add(new Emp1(2,"prabha"));
		al.add(new Emp1(8,"rina"));
		al.add(new Emp1(3,"nilam"));
		/*Collections.sort(al, new Emp1idComp());
		for(Emp1 e:al){
			System.out.println(e.eid+" "+e.ename);
		}*/
		//sorting by ename
		Collections.sort(al, new Emp1nameComp());
		for(Emp1 e:al){
			System.out.println(e.eid+" "+e.ename);

		}
}

}
