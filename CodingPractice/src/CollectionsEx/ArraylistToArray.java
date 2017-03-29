package CollectionsEx;
//How to copy ArrayList to array?

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
	ArrayList<String>arl = new ArrayList<String>();
	arl.add("book");
	arl.add("pencil");
	arl.add("pen");
    arl.add("erasor");
    arl.add("sharpner");
    arl.add("notebook");
    System.out.println("Arraylist elements--"+arl);
    String[] str = new String[arl.size()];
	System.out.println("Array elements :");

    arl.toArray(str);
    for(String s:str){
    	System.out.println(s);
    }
    }

}
