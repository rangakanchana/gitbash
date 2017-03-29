import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class StreamEx {
	public static void main(String[] args)throws IOException {
		/*System.out.println("hi");
		System.err.println("error");
		System.out.println("please enter");
		char c = (char)System.in.read();
		System.out.println(c);*/
		//read from a file;FileInputStream
/*FileInputStream in = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt");
int i=0;
while((i=in.read())!=-1){
	char ch = (char)i;
	System.out.print(ch);
	}
in.close();*/
		//write into a file;FileOutputStream
		/*FileOutputStream out = new FileOutputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\fout.txt");
		String s = "Lets do it possible";
		out.write(s.getBytes());
		System.out.println("success");
		out.close();*/
		//write to multiple files;ByteArrayOutputStream
/*FileOutputStream out1 = new FileOutputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\oput1.txt");
FileOutputStream out2 = new FileOutputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\oput2.txt");
ByteArrayOutputStream bout = new ByteArrayOutputStream();
String st = "I can do it";
bout.write(st.getBytes());
bout.writeTo(out1);
bout.writeTo(out2);
System.out.println("success");
out1.close();
out2.close();
out1.flush();
out2.flush();*/
		//reading text from multiple files;SequenceOutputStream
	/*FileInputStream in1 = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\input1.txt");
	FileInputStream in2 = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\input2.txt");
	SequenceInputStream seq = new SequenceInputStream(in1,in2);
	int i = 0;
	while((i = seq.read())!=-1){
		System.out.print((char)i);
	}
	in2.close();  
	seq.close();*/
		}
	}

