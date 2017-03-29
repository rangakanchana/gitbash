package IOpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Deserialization---reading the object from text file; we need FileInputStrem and ObjectInputStream classes are required 
public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("C:\\Users\\sridhar\\java\\abc.txt");	
    ObjectInputStream ois = new ObjectInputStream(fis);
    Emp1 e =(Emp1)ois.readObject();
    System.out.println(e.ename+" "+e.eid);
    ois.close();
	}

}
