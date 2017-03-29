package CollectionsEx;
import java.util.Vector;

public class CopyArryVector {

	public static void main(String[] args) {
		 Vector<String> vector = new Vector<String>();
	        vector.add("One");
	        vector.add("Two");
	        vector.add("Three");
	        vector.add("Four");
	        System.out.println(vector);
	        String[] copyArray = new String[vector.size()];
	        vector.copyInto(copyArray);
	        System.out.println("Copied Array :");
	        for(String str:copyArray){
	            System.out.println(str);
	}

}
}
