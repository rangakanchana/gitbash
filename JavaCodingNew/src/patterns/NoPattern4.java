/**
 * 
 */
package patterns;

import java.util.Scanner;

/**               7 
7
14 15 
28 29 30 31 
56 57 58 59 60 61 62 63 

 * @author sridhar
 *
 */
public class NoPattern4 {
	
	public static void printPattern(int n,int l)
		{
		int k=1;
		for(int i=1;i<=l;i++)
		{
		int N=n*k;
		for(int j=0;j<k;j++)                                        //  n=7  L=4    k=1   N=28;   0<1 k=4 
		{
System.out.print( N+j+" 7");		}
		k=k*2;
		System.out.println();                                                                              
		}
		}
		                                                                            
		public static void main(String[] args)
		{
		Scanner in=new Scanner(System.in);
		System.out.println("please enter a int for printing pattern");
		int n=in.nextInt();
		System.out.println("enter number of lines");
		int l=in.nextInt();
		in.close();
		printPattern(n,l);
		}
		}
	


