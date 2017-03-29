package CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;




public class ComparableEx{
	public static void main(String[] args) {
		
	
	ArrayList<Emp> al = new ArrayList<Emp>();
	al.add(new Emp(2,"prabha"));
	al.add(new Emp(1,"Rina"));
	al.add(new Emp(4,"Neelam"));
	al.add(new Emp(3,"Gayathri"));
	Collections.sort(al);
	for(Emp e:al){
		System.out.println(e.eid+"  "+e.ename);
	}
	}
	
	
	

}
