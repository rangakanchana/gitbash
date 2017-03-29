import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class UtilEx {
	//reading from console:FileInputStream and Properties
	static void readProp(){
try {
	FileInputStream input = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\prop.properties");
	Properties prop = new Properties();
prop.load(input);
String property = prop.getProperty("username");
String property1=prop.getProperty("password");
System.out.println("the usename  is "+ property);
System.out.println("the password is "+ property1);

} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
}
	
	
public static void main(String[] args) {
	UtilEx.readProp();
}
}
