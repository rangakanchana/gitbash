import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardEx {
	public static void method1() throws IOException{
		//from keyboard using InputStreamReader
		InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader breader = new BufferedReader(reader);
    String data = " ";
    while(!data.equals("stop")){
    	System.out.println("Enter the data");
    	data=breader.readLine();
    	System.out.println(data);
}
}
	//one more ex from InputStreamReader
	public static void method2(){
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader bread = new BufferedReader(read);
		System.out.println("Enter the name");
		try {
		String name = bread.readLine();
        System.out.println("Candidate name is "+ name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
    }
	//read from console
	public static void method3(){
		Console cs = null;
		String s = null;
		cs = System.console();
		if(cs!=null){
			s=cs.readLine("name:");
			System.out.println("name is "+ s);
			//char[]pwd=cs.readPassword("password:");
		//	System.out.println("password is "+pwd);
		}	
		}
	//read from scanner
	public static void method4(){
		Scanner sc = new Scanner(System.in);
		String name=" ";
        while(!name.equals("stop")){
    		System.out.println("Enter name");
             name = sc.nextLine();
     		System.out.println("Candidate name is "+ name);
     		}
		sc.close();
	}
    public static void main(String[] args) throws IOException {
		//KeyboardEx.method1();
		//KeyboardEx.method2();
		//KeyboardEx.method3();
		//KeyboardEx.method4();
		
	}
}