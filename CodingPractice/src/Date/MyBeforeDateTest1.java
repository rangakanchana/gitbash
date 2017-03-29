package Date;

import java.util.Date;

public class MyBeforeDateTest1 {
	//How to check if the date is before the specified date?

	public static void main(String[] args) {
		Date date1 = new Date(11,5,2016);
		Date date2 = new Date(12,6,2016);
		
		//tests if date2 is before date1
		boolean before =date2.before(date1);
		System.out.println("Date2 is before date1----"+before);
		//tests if date1 is before date2
		 before= date1.before(date2);
		 System.out.println("Date1 is before date2----"+before);
		

	}

}
