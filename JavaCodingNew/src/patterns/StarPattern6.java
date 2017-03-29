/**
 * 
 */
package patterns;

/**                  * * * * *
                       * * * * 
                         * * * 
                           * * 
                             *
 * @author sridhar
 *
 */
public class StarPattern6 {
	
	public static void main(String[] args) {
		
		int starcount = 5;
		int spacecount =0;
		
		for(int i=1;i<=5;i++){
			//for printing rows
			System.out.println();
			
			//for printing spaces
			for(int k=1;k<=spacecount;k++){
				
				System.out.print(" ");
			}
			//for printing stars
			for(int j=1;j<=starcount;j++){
				
				System.out.print("*");}
			starcount--;
			spacecount++;
		}
		
		
	}

}
