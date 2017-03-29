package CollectionsEx;
//How to shuffle elements in ArrayList?by Using Collections.shuffle();

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {

	public static void main(String[] args) {
	List<String>list = new ArrayList<String>();
	list.add("madhu");
	list.add("geetha");
	list.add("rama");
	list.add("radha");
	list.add("sumana");
	list.add("chandana");
	System.out.println("Actual list: ");
	System.out.println(list);
	System.out.println("Shuffle list: ");
	Collections.shuffle(list);
	System.out.println(list);
}

}
