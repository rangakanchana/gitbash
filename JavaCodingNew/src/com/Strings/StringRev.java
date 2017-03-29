package com.Strings;


public class StringRev {
	//using toCharArray method
	public static void stringRev(String str){
		
		String rev = "";
		
		char[] charArr=str.toCharArray();
		
		for(int i=charArr.length-1;i>=0;i--){
		rev = rev+charArr[i];
		
			
		}
		System.out.println(rev);
}
	//using charAt function
	
	public static void stringRev1(String str){
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--){
			
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	//using recursive method,in recursive methods,3 things should be there
	//1.if statement,return statement and calling original method
	public static String reverse(String str){
		
		if((str.length()<=1)||(str==null)){
			
			return str;
		}
		else{
			
			return reverse(str.substring(1,str.length()))+str.charAt(0);
			
		}
		
	}
	
	public static void main(String[]args){
		
		String str = "kanchana";
		//StringRev.stringRev(str);
		//StringRev.stringRev1(str);
		System.out.println(reverse(str));
		
	}

}
