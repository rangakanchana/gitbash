package com.Strings;

public class StringRevEachWord {
	
	public static String stringRevEach(String str){   //java is the programming language
		//java is a language
		String reverse = " ";
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			String revEach = " ";
			for(int j=words[i].length()-1;j>=0;j--){
				revEach = revEach+words[i].charAt(j);   //avaj
			}
			reverse = reverse+revEach+"";
		}
		
		System.out.println("the reverse of each word in String is:"+reverse);
		return reverse;
		
		
	}
	public static void main(String[] args) {
		StringRevEachWord.stringRevEach("java is a programming language");
	}

}
