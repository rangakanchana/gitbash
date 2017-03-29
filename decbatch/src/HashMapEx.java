import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
 HashMap h = new HashMap();
 h.put(1, "raju");
 h.put(5, "geetha");
 h.put(2,"radha");
 h.put(3, "tina");
 System.out.println(h);
 
 //to print only key values
 Set s = h.keySet();
 System.out.println(s);
 
 //to print only values
 Collection c = h.values();
 System.out.println(c);
 
 //to print both key and value by using entryset();
 //so that we can use cursor(itereator)
 
 Set s1 = h.entrySet();
 Iterator itr = s1.iterator();
 while(itr.hasNext()){
	 Map.Entry m = (Map.Entry) itr.next(); //it returns entry that represents map.entry
	 System.out.println(m.getKey()+"   "+m.getValue());
 }
 }
}
