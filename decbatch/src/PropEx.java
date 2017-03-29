import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropEx {

	public static void main(String[] args) throws Exception {
		//read the properties file
FileInputStream fir = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\abc.properties");
	
 //load properties, create properties class

Properties p = new Properties();
p.load(fir);
//get the properties file

String uname = p.getProperty("username");
String pwd = p.getProperty("password");

//print the values

System.out.println(uname);
System.out.println(pwd);


		
		
		
		
	}

}
