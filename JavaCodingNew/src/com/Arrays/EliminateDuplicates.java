package com.Arrays;

/*we have 2 methods to eliminate duplicates
one is comparing elements eachother
second is adding these elements into hashset
*/

import java.util.HashSet;

public class EliminateDuplicates {
	
	public static String removeDuplicates(String[] arr){
		
		String duplicateEle = "";  //{1,2,3,4,5}
		
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if((arr[j].equals(arr[i])&&(i!=j))){
					
				System.out.println("the duplicate element is: "+arr[j]);	
				}
			}
		}
		return duplicateEle;
	}
	//second method--adding elements into hashset
	public static String remDuplicates(String[]arr){
		String duplicate="";
		HashSet<String>hs=new HashSet<>();
		for(String elements:arr){
			
			if(!hs.add(elements)){
				
				System.out.println("the duplicate elements are:"+elements);
			}
		}
		return duplicate;
	}
	public static void main(String[] args) {
		String[]arr = {"radha","prabha","radha","rina","geetha","rina","prabha"};
		//EliminateDuplicates.removeDuplicates(arr);
		EliminateDuplicates.remDuplicates(arr);
		
	}
}
