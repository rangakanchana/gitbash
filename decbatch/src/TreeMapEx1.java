import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {

		TreeMap t = new TreeMap();
		t.put(1, "kanchana");
		t.put(2, "prabha");
		t.put(3, "rina");
		t.put(4, "geetha");
		System.out.println(t); //{1=kanchana, 2=prabha, 3=rina, 4=geetha}

		SortedMap s = t.tailMap(3);
		System.out.println(s);  //{3=rina, 4=geetha
		
		SortedMap s1 = t.headMap(3);
		System.out.println(s1);  //{1=kanchana, 2=prabha}

	//3rd constructor passing sorted map
		TreeMap t1 = new TreeMap(s);
		System.out.println(t1);  //{3=rina, 4=geetha}
		}
		
		
		
		
		
		
	}


