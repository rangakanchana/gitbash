import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
  //customization sorting performance using comparator interface
	//data belongs to our own objects---class doesnt impements comparable interface	
		
		//i need to create EnameComp object and pass it as parameter in the Treemap
		
		TreeMap t = new TreeMap(new EnameComp());
		t.put(new Emp(1,"kanchana"), "aaa");
		t.put(new Emp(2,"prabha"), "bbb");
		t.put(new Emp(3,"rina"), "ccc");
		//System.out.println(t); // Emp cannot be cast to java.lang.Comparable
		
		Set <Emp> s = t.keySet();
		for(Emp e :s){
			System.out.println(e.eid+"  "+ e.ename);
		}
		
//so for sorting we need to do customization sorting of using Comparator interface
		
		
		
		
		
		
	}

}
