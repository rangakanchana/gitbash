package CollectionsEx;


public class Student implements Comparable<Student> {

  int sid;
  String sname;
   Student(int sid,String sname){
	   this.sid = sid;
	   this.sname=sname;
	  
  }
  /* public int compareTo(Student s){
	if(sid==s.sid){
		return 0;
	}else if(sid>s.sid){
		return 1;
		}else{
			return -1;
		}
		
	   
   }*/
   /*public int compareTo(Student s){
	   return sname.compareTo(s.sname);
   }*/
   //sname decsending order
	public int compareTo(Student s){
		return -sname.compareTo(s.sname);
	}
		
		
		
	}


