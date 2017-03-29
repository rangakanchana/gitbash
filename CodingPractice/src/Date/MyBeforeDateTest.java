package Date;

import java.util.Date;

//How to check if the date is before the specified date? 
public class MyBeforeDateTest {
public static void main(String[] args) {
		Date current= new Date();
		System.out.println(current);
	//create date one day before current date
		Long prevday = System.currentTimeMillis();
		System.out.println(prevday);
		
		//create prevday object
		Date prev = new Date(prevday);
		//compare both dates
		if(prev.before(current)){
			System.out.println("the date is olderthan the current date");
		}else{
			System.out.println("the date is future date");
		}

	}

}
