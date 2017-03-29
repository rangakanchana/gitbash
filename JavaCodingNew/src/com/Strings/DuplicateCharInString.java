package com.Strings;

import java.util.HashMap;
import java.util.Set;

/*We use Hashmap and Set to find the duplicate characters in a string. 
 * First, we convert the given string to char array. 
 * We then create one Hashmap with Character as a key and it’s number of occurrences as a value. 
 * Then we extract a Set containing all keys of this Hashmap using keySet() method.
 *  Then we use this keySet to get the duplicate characters i.e 
 * characters which have appeared more than once in the given string.*/

public class DuplicateCharInString {

	public static void countDuplicates(String str) {
		

		// Creating a Hashmapap containing char as key and it's occurrences as
		// value
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] toCharArray = str.toCharArray();

		// checking each char of strArray
		for (char ch : toCharArray) {

			if (hmap.containsKey(ch)) {
				// If char is present in hmap, incrementing it's count by 1
				hmap.put(ch, hmap.get(ch) + 1);
				

			} else {
				// If char is not present in hmap,
				// putting this char to hmap with 1 as it's value
				hmap.put(ch, 1);
			}
		}
		// Getting a Set containing all keys of charCountMap
		Set<Character> charsInString = hmap.keySet();
		System.out.println("Duplicate Characters In " + str);

		// Iterating through Set 'charsInString'
		for (Character c : charsInString) {

			if (hmap.get(c) > 1) {
				// If any char has a count of more than 1, printing it's count

				System.out.println(c + " : " + hmap.get(c));
			}

		}
	}
	
	
		
	

	public static void main(String[] args) {

		// DuplicateCharInString.countDuplicates("java j2ee");
		DuplicateCharInString.countDuplicates("Better Butter");
		
	}
	
	
}
