package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

//How to format date into user define format?
//E-----day in a week
//a----PM or AM
//z----time zone

public class FormatDate {

	public static void main(String[] args) {
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd  'at'HH:mm:ss a z");
System.out.println("E yyyy.MM.dd  'at'HH:mm:ss a z-----"+ sdf.format(date));

sdf = new SimpleDateFormat("hh 'o' 'clock'a,zzzz");
System.out.println("hh 'o' 'clock' a,zzzz----"+sdf.format(date));

	}

}
