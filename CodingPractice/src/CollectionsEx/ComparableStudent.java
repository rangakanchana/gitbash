package CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableStudent {

	public static void main(String[] args) {
ArrayList<Student>al = new ArrayList<Student>();
al.add(new Student(001,"aaa"));
al.add(new Student(003,"zzz"));
al.add(new Student(005,"ccc"));
al.add(new Student(004,"rrr"));
Collections.sort(al);
for(Student ss:al){
	System.out.println(ss.sid+"---"+ss.sname);
}

		
		
		
		
	}

}
