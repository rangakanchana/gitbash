package Date;

import java.util.Date;

public class DateBasics {

	public static void main(String[] args) {
Date d = new Date();
System.out.println("Today date is "+d);
System.out.println("Current date is "+d.getDate());
System.out.println("Current day si "+d.getDay());
System.out.println("Current month is "+d.getMonth());
System.out.println("current year is "+d.getYear());
System.out.println("Current hours "+d.getHours());
System.out.println("Current minutes "+d.getMinutes());
System.out.println("Current seconds "+d.getSeconds());
System.out.println("Current time is "+d.getTime());


	}

}
