/**
 * 
 */
package patterns;
     
/**
 *      *****
        ****
        ***
        **
        * 
 * @author sridhar
 *
 */
public class StarPattern3 {
	
	public static void main(String[] args) {
		int starcount = 5;
		
		for(int i=1;i<=5;i++){       
			
			System.out.println();

			for(int j=1;j<=starcount;j++){     
				
				System.out.print("*");
			}
			starcount--;
		}
}
}
