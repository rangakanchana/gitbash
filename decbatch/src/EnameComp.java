import java.util.Comparator;

public class EnameComp implements Comparator<Emp>{
	public int compare(Emp e1,Emp e2){
//i want to compare using ename(Emp is the key in Treemap)
		
		return (e1.ename).compareTo(e2.ename);
}
}
