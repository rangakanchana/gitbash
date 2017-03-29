package com.Strings;
//wap to find spaces in between characters-----javastring----j a v a s t r i n g

public class SpaceBetCharacters {
	
	public static String insertCharacterForEveryNDistance(int distance, String original, char c){
	    StringBuilder sb = new StringBuilder();
	    char[] charArrayOfOriginal = original.toCharArray();
	    for(int i = 0 ; i < charArrayOfOriginal.length ; i++){
	        if(i % distance == 0)  {          
	            sb.append(c).append(charArrayOfOriginal[i]);
	       // System.out.println(sb.toString());
	        }
	        else{
	            sb.append(charArrayOfOriginal[i]);
	       // System.out.println(sb.toString());
	        }
	        }
	    return sb.toString();
	}
  public static void main(String[] args) {
	  
	  String result = SpaceBetCharacters.insertCharacterForEveryNDistance(2, "javastring", ' ');
	System.out.println(result);
}
	
	
	}


