import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOInputExample {
	//read from a file;FileInputStream
	static void readfile(String path)
	{
		FileInputStream in;
		try {
			in = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt");
			int i;
			 while(( i = in.read())!= -1)
{
	System.out.print( (char)i);
}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	//write into a file
	static void writeFile(String path){
		FileOutputStream out=null;
		try {
			 out = new FileOutputStream(new File ("C:\\Users\\sridhar\\Desktop\\IO Demo\\output1.txt"));
			 String s = "writing into a  file";
			 out.write(s.getBytes());
			 System.out.println("success");
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
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	//write to multiple files
	static void WritetoMultipleFiles()
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		FileOutputStream out1;
		FileOutputStream out2;

		try {
			out1 = new FileOutputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\output1.txt"));
			out2 = new FileOutputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\output2.txt"));
            out.write(100);
            out.writeTo(out1);
            out.writeTo(out2);

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
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//read from 2 files and copy to 1 file:SequenceInputStream
	static void copyData(){
		FileOutputStream out1=null;
		FileInputStream in1=null;
		FileInputStream in2=null;
		SequenceInputStream sis=null;
		
		try {
			 out1 = new FileOutputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\output1.txt"));
			 in1 = new FileInputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt"));
			 in2 = new FileInputStream(new File("C:\\Users\\sridhar\\Desktop\\IO Demo\\input2.txt"));
             sis = new SequenceInputStream(in1,in2 );
             int i;
             while((i = sis.read())!= -1){
            	 out1.write(i);
            	 
             }
              }catch(FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally{
			try {
				out1.flush();
				out1.close();
				in1.close();
				in2.close();
				sis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String path = "C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt";
		//IOInputExample.readfile("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt");
		//IOInputExample.writeFile(path);
		//IOInputExample.WritetoMultipleFiles();
		IOInputExample.copyData();
	}

}
