package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class SecondRepeatedChar2 {
	
	public static void findSecondRepeated(String s){
		
		Map<Character,Integer> map = new HashMap<>();
		
		boolean foundFirst = false;  //to find first repeated and eliminate character
		
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<charArray.length;i++){
			
			if(map.containsKey(charArray[i])){
				
				if(foundFirst){
					System.out.println("the second repeated char is :::"+charArray[i]);
					break;

					}else{
						foundFirst = true;
				}
			        }
			        else{
						map.put(charArray[i], 1);
			        }
	                }
	                }   
	
	public static void main(String[]args){
		
		SecondRepeatedChar2.findSecondRepeated("kayak");
		
		
		
	}
	
	
	

}
