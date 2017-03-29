/**
 * 
 */
package patterns;

/**     *
      * *
    * * *
  * * * *
* * * * *
 * @author sridhar
 *
 */
public class StarPattern5 {
	
	public static void main(String[] args) {
		
		int spacecount = 4;
		int starcount = 1;
		
		for(int i=1;i<=5;i++){
			
			System.out.println();
			
		for(int j=1;j<=spacecount;j++){
			
			System.out.print(" ");}
		for(int k=1;k<=starcount;k++){
			System.out.print("*");}
		
		spacecount--;
		starcount++;
		}
		}
		}


