package CollectionsEx;
//How to reverse ArrayList content? Using Collections.reverse();

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
	ArrayList <String>arl = new ArrayList<String>();
	arl.add("one");
	arl.add("three");
	arl.add("four");
	arl.add("eight");
	arl.add("nine");
	arl.add("seven");
	/*Collections.reverse(arl);
	System.out.println("Reverse arraylist: ");
	for(String s:arl){
		System.out.println(s);
	}*/
	//another way of reversing
	for(int i=arl.size()-1;i>=0;i--){
		System.out.println(arl.get(i));
	}
}

}
