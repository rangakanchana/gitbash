import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx {
public static void buffIn() throws Exception{
	//to read the file
	FileInputStream in = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt");
	BufferedInputStream buff = new BufferedInputStream(in);
	int i = 0;
	while((i=buff.read())!=-1){
		System.out.print((char)i);
		}
	buff.close();
}
//write into file using BufferedOutputStream
public static void buffout() throws IOException{
	FileOutputStream out = new FileOutputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\bout.txt");
	BufferedOutputStream  bout = new BufferedOutputStream(out);
	String s = "You are Awsome";
	bout.write(s.getBytes());
	System.out.println("Success");
	bout.close();
	bout.flush();
	}
// read file using FileReader
public static void fileIn() throws IOException{
	FileReader fr = new FileReader("C:\\Users\\sridhar\\Desktop\\IO Demo\\bout.txt");
	int i =0;
while((i=fr.read())	!= -1){
	System.out.print((char)i);
	}
fr.close();
}
//write into file using FileWriter
public static void fileout() throws IOException{
	FileWriter frout = new FileWriter("C:\\Users\\sridhar\\Desktop\\IO Demo\\fw.txt");
String s = "All are similar in java IO!!!";
frout.write(s);
frout.close();
System.out.println("success");
}


public static void main(String[] args) throws Exception{
//BufferedEx.buffIn();
	//BufferedEx.buffout();
	//BufferedEx.fileIn();
	BufferedEx.fileout();
}
}
