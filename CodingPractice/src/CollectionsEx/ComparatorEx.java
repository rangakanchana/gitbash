package CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx {

	public static void main(String[] args) {
ArrayList<Emp> hs = new ArrayList<Emp>();
hs.add(new Emp(121,"Book"));
hs.add(new Emp(113,"Pencil"));
hs.add(new Emp(102,"Pen"));
hs.add(new Emp(190,"Scale"));

//Collections.sort(list, comparator);

Collections.sort(hs,new EnameComp());
for(Emp e:hs){
	System.out.println(e.eid+"  "+e.ename);
}






	}

}
