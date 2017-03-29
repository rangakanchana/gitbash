package IOpackage;

import java.io.Serializable;

public class Emp1 implements Serializable {
	String ename;
	int eid;
	Emp1(String ename,int eid){
		this.ename = ename;
		this.eid=eid;
	}

}
