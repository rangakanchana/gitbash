package CollectionsEx;
//How to get entry set from HashMap? by Using entrySet();

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapEntry {

	public static void main(String[] args) {
	HashMap<String,String>hm = new HashMap<String,String>();
	hm.put("two", "Lessthan");
	hm.put("one", "greaterthan");
	hm.put("three", "equal");
	hm.put("five", "morethan");
	hm.put("four", "notequal");
	System.out.println(hm);
	
	Set<Entry<String,String>>entries=hm.entrySet();
	for(Entry<String,String>entry:entries){
		System.out.println(entry.getKey()+"----"+entry.getValue());
	}

		
		

	}

}
