/**
 * 
 */
package patterns;

/**         *
 *        * * * 
 *      * * * * *
 *    * * * * * * *
 *  * * * * * * * * *
 *  
 *        first row 4 spaces and 1 star
 *        second row 3 spaces and 3 stars
 *        third row 2 spaces and 5 stars
 *        fourth row 1 space and 7 stars
 *        fifth row 0 spaces and 9 stars
 * @author sridhar
 *
 */
public class StarPyramid {
	
	public static void main(String[] args) {
		//simple way---memory wastage
		int spacecount = 4;
		int starcount = 1;
		
		for(int i=1;i<=5;i++){
			System.out.println();     //for every row
			//for printing spaces
			for(int j=1;j<=spacecount;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++){
			System.out.print("*");
			}
			spacecount--;
			starcount=starcount+2;
			
		}
		/*for(int i=5;i>=1;i--){
			System.out.println();
		for(int j=1;j<i;j++){
			System.out.print(" ");}
	
		for(int k=1;k<i;k++){
			
		System.out.print("*");	
		}
		
		}*/
	}	   
}