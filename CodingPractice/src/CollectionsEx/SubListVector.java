package CollectionsEx;

import java.util.List;
import java.util.Vector;

public class SubListVector {

	public static void main(String[] args) {
Vector<String> vct = new Vector<String>();
vct.add("one");
vct.add("two");
vct.add("three");
vct.add("four");
vct.add("five");
System.out.println("actual vector--"+vct);
List<String>list = vct.subList(1, 3);
System.out.println("sublist of vector is--"+list);






	}

}
