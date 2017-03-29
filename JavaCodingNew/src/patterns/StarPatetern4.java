/**
 * 
 */
package patterns;

/**    * * * * *      i=1 and 5 and j=1 and 5
 *     *       *
 *     *       *
 *     *       *
 *     * * * * *
 * @author sridhar
 *
 */
public class StarPatetern4 {
    
	static int i,j;
	public static void main(String[] args) {
		
		for(i=1;i<=5;i++){
			
			for(j=1;j<=5;j++){
			if( i==1 ||i==5 || j==1||j==5){
				
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			}
			System.out.println();
		}
}
}
