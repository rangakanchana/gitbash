import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap<Emp,Student> h = new HashMap<Emp,Student>();
		
		h.put(new Emp(111,"geetha"),new Student(1,"aaa"));
		h.put(new Emp(222,"kanchana"),new Student(2,"bbb"));
		h.put(new Emp(333,"prabha"),new Student(3,"ccc"));
		
		Set s = h.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry)itr.next();
			Emp e = (Emp)m.getKey();
			System.out.println(e.eid +"  "+ e.ename);
			Student s1 = (Student)m.getValue();
			System.out.println(s1.sid+ "  "+ s1.sname);
}
}
}
