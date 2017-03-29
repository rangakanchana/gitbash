import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
//Treeset is having StringBuffer data and String data
		
		TreeSet t = new TreeSet(new MyComp1());
		t.add(new StringBuffer("kanchana"));
		t.add(new StringBuffer("prabha"));
		t.add("geetha");
		t.add("rina");
		System.out.println(t);
}
}
