package com.Strings;

import java.util.Arrays;

/*Anagram Program In Java Using Iterative Method

In this method, we go on checking each character of first string is present in second string. 
If it is present, we remove that character from second string and proceed to next character. 
If any character of first string is not present in second string, 
we break the loop and conclude that strings are not anagrams.*/

public class AnagramEx {
	
	public static void isAnagram(String s1,String s2){
	//Removing white spaces from s1 and s2 and changing case to lower
		
		String ss1 = s1.replaceAll("\\s", "").toLowerCase();
		String ss2 = s2.replaceAll("\\s", "").toLowerCase();
		
		 //Initially setting status as true
		boolean status = true;
		
		 //Setting status as false if ss1 and ss2 doesn't have same length
		if(ss1.length()!=ss2.length()){
			status = false;
		}
		else{
			//Converting ss1 to char array
			
			char[] s1ToChar = ss1.toCharArray();
			
			//Checking whether each character of s1ToChar is present in ss2
			
			for(char c : s1ToChar){
				
			int index =	ss2.indexOf(c);     //d index=0,o--index=5
			if(index != -1){
				//If character is present in ss2, removing that char from ss2
				ss2 = ss2.substring(0, index)+ss2.substring(index+1, ss2.length());//deletes d/ (0,5)+(6,8)
			}else{
				//If character is not present in ss2, setting status as false and breaking the loop
				status = false;
				break;
			}
			}
			if(status){
				
				System.out.println(s1+" and " +s2+ " are anagrams");
			}
			else{
				System.out.println(s1+" and " +s2+ " are not anagrams");
	
				}
			}
			
		}
	//2nd method using arrays.sort and arrays.equals method
	
		public static void isAnagrams(String s1,String s2){
			
			String ss1 = s1.replaceAll("//s", "").toLowerCase();
			String ss2 = s2.replaceAll("//s", "").toLowerCase();
			
			char[] s1Array = ss1.toCharArray();
			char[] s2Array = ss2.toCharArray();
			
			boolean status = false;
			
			//Sorting both s1Array and s2Array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//Checking whether s1Array and s2Array are equal
			status = Arrays.equals(s1Array, s2Array);
			
			if(status){
				
			System.out.println("both strings are anagrams");	
			}else
			System.out.println("Given strings are not anagrams"); 
			}
	
	public static void main(String[] args) {
		
		AnagramEx.isAnagram("Dormitory", "Dirtyroom");
		//AnagramEx.isAnagram("string", "strong");
		//AnagramEx.isAnagram("keep", "peek");
        //AnagramEx.isAnagrams("Debitcard", "badcredit");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


