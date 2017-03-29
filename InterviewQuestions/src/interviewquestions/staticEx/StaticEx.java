/**
 * 
 */
package interviewquestions.staticEx;

/**
 * @author sridhar
 *
 */
public class StaticEx {
	
	
	   public static void copyArg(String str1, String str2)
	   
	   {
	       //copies argument 2 to arg1
	       str2 = str1;
	       System.out.println("First String arg is: "+str1);
	       System.out.println("Second String arg is: "+str2);
	   }
	   public void display()
	   {
	       System.out.println("I'm non-static method");
	   }
	   
	   public static void main(String args[])
	   {
	      //StaticEx.copyArg("XYZ", "ABC");
	      copyArg("XYZ", "ABC");
	   
	   StaticEx object =new StaticEx();
	   object.display();
       
	   }   
	}


