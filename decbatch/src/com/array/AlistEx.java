package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AlistEx {
	public static void main(String[] args) {
ArrayList<String> alist = new ArrayList<String>();
alist.add("bharti");
alist.add("kanchana");
alist.add(2, "geetha");
alist.add(3,"prabha");
alist.add("100");
alist.add("");
alist.add(3, "rina");
alist.add("kanchana");

//System.out.println(alist.get(3));
//retrieving elements from list.
/*for(int i=0;i<alist.size();i++){
	System.out.println(alist.get(i));
	*/
// another way of retriving elements;for each loop
/*for(String s: alist)
{
	System.out.println(s);
}*/
//another way of retriving elements---Iterator Interface

/*Iterator <String> itr = alist.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}*/


		// anotherway of retrieving elements ----listiterator interface
        
      ListIterator<String> it = alist.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	
		//anotherway of retrieving elements in reverse order----Listiterator
	while(it.hasPrevious())	
	{
			System.out.println(it.previous());
			
			
		}
		
		
		
		
		
	}

}
