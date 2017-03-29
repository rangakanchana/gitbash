/**
 * 
 */
package com.Strings;

/**we can do this by 2 ways
 * one method is by using replaceAll method
 * otherone is converting tocharArray and append it to StringBuffer
 * @author sridhar
 *this is the second method.
 */
public class RemoveWhiteSpaces {
	
	public static void removeSpace(String s){
		
		char[] charArray = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<charArray.length;i++){
			
			if((charArray[i]!=' ')&&(charArray[i]!='\t')){ //if it is not a character then append to sb otherwise ignore it.
				sb.append(s.toCharArray()[i]);
			}
			}
		System.out.println(sb);
		}
      public static void main(String[] args) {
    	  RemoveWhiteSpaces.removeSpace("ja va  is    a  progra  mming");
    	  
    	  
	
}
}
