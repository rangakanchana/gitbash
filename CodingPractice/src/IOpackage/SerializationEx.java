package IOpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization means---writing the object into text file---so we need FileOutputStream and ObjectOutputStream classes
public class SerializationEx {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		Emp1 e = new Emp1("sridhar",1);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sridhar\\java\\abc.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
	    oos.writeObject(e);
	    
//new ObjectOutputStream(new FileOutputStream("C:\\Users\\sridhar\\java\\abc.txt")).writeObject(e);	    
		System.out.println("Serialization process completed");
oos.close();
	}
	

}
