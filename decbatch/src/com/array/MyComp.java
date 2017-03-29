package com.array;

import java.util.Comparator;

public class MyComp implements Comparator<StringBuffer> {

	public int compare(StringBuffer sb1,StringBuffer sb2){
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		return s1.compareTo(s2);
	

}
}
