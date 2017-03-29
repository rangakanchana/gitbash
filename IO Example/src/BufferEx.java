import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferEx {
	static void bufferExample(){
		FileInputStream in;
		BufferedInputStream buffin;
		
	 try {		 
		 in = new FileInputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt"));
		 buffin = new BufferedInputStream(in);
		 int i;
		 while((i = buffin.read())!= -1){
			System.out.print((char)i); 
			  }
	     } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	//bufferoutput
	static void bufferOutEx(){
		FileOutputStream out= null;
		BufferedOutputStream buffout= null;
		try {
			 out = new FileOutputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\output3.txt"));
			 buffout = new BufferedOutputStream(out);
			 String s = "you are rocking !!!!";
			 buffout.write(s.getBytes());
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		finally{
			try {
				
				out.flush();
				buffout.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
	//read from console;InputStreamReader and Scanner
	static void readFromConsole(){
		Scanner scr = new Scanner(System.in);
		//InputStreamReader reader = new InputStreamReader(System.in);
	//	BufferedReader buff = new BufferedReader(reader);
		System.out.println("Enter your name");
     //  String name = null;
       String name1 = scr.nextLine();
       System.out.println("My name is "+ name1);
	}
	/*try {
		name = buff.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("My name is "+ name);
	}*/
	
        public static void main(String[] args) {
		//BufferEx.bufferExample();
		//BufferEx.bufferOutEx();
        BufferEx.readFromConsole();	
		
		}

}
