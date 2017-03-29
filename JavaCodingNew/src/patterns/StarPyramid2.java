/**
 * 
 */
package patterns;

/**                        * * * * * * * * *
                             * * * * * * *
                               * * * * *
                                 * * *
                                   *
* @author sridhar
 *
 */
public class StarPyramid2 {
	
	public static void main(String[] args) {
		
		/*int starcount = 9;
		int spacecount = 0;
		
		for(int i=1;i<=5;i++){
			
		System.out.println();	
		
		
		for(int k=1;k<=spacecount;k++){
			
			System.out.print(" ");
		}
		for(int j=1;j<=starcount;j++){
			System.out.print("*");
		}
		spacecount++;

		starcount=starcount-2;
		}*/
		for(int i=5;i>=1;i--){
			   System.out.println();
		   
	       for(int j=5;j>i;j--){
	    	 System.out.print(" ");  
	       }
	       for(int k=1;k<(i*2);k++){
	    	   System.out.print("*");
	       }
		   }   
	       }
		}


