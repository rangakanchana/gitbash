package Date;

import java.util.Date;

//How to create a date with milli seconds?
public class DateCreation {

	public static void main(String[] args) {
//get current time in milli seconds
	long currenttimeinsec = System.currentTimeMillis();	
	//Date d = new Date();
	Date d = new Date(currenttimeinsec);
	System.out.println(d);

	}

}
