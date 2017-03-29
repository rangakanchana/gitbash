package CollectionsEx;
//not generic version
public class Emp implements Comparable{
	int eid;
	String ename;
	Emp(int eid,String ename){
		this.eid = eid;  //conversion of local to instance variables
	this.ename = ename;
		}
	public int compareTo(Object o){
		Emp e = (Emp)o;
		if(eid==e.eid){
			return 0;
		}else if(eid>e.eid){
			return 1;
		}else{
			return -1;
			}
		}
	/*public int compareTo(Emp e){
		return ename.compareTo(e.ename);*/
		

	}

	
	
	
	
	


