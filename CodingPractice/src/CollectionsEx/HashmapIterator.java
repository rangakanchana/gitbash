package CollectionsEx;
//How to iterate through HashMap?using keyset();

import java.util.HashMap;
import java.util.Set;

public class HashmapIterator {

	public static void main(String[] args) {
		HashMap<String,String>hm = new HashMap<String,String>();
		hm.put("2", "book");
		hm.put("4", "erasor");
		hm.put("6", "colour");
		hm.put("3", "red");
		hm.put("1", "blue");
	Set<String>s=hm.keySet();
	for(String s1:s){
		System.out.println("the value of "+s1+" is:" +hm.get(s1));
		
	}


	}

}
