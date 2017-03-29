package com.Arrays;

import java.util.HashMap;

public class PatternMatcher {
	
	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<String, Integer>();
		  try {

		   String input = "ababahjabaghjabiabj";
		   for (int i = 0; (i + 2) <= input.length(); i++) {
		    String pattern = input.substring(i, i + 2);
		    String substr = "";
		    if (!map.containsKey(pattern)) {
		     for (int j = i + 1; (j + 2) <= input.length(); j++) {
		      substr = input.substring(j, j + 2);
		      if (pattern.equals(substr)) {
		       if (map.containsKey(pattern)) {
		        map.put(pattern, map.get(pattern) + 1);
		       } else {
		        map.put(pattern, 2);
		       }
		      }
		     }
		    }
		   }
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  for (String key : map.keySet()) {
		   System.out.println(map.get(key) + "::" + key);
		  }
		 }

		}


