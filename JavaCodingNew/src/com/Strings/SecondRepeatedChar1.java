package com.Strings;

public class SecondRepeatedChar1 {
	
	
	public static void duplicate(String s){
			
			int count = 0;
			
			for(int i=0;i<s.length();i++){
				
				for(int j=i+1;j<s.length();j++){
					
					if(s.charAt(i)==s.charAt(j)){
						
						count++;
						
						if(count==1){
							
							System.out.println(s.charAt(i));
							
						}
						break;
					}
					}
				
			        }
	            	}
		
		     
			 public static void main(String[] args) {
				 
				 SecondRepeatedChar1.duplicate("kayak");
	

}
}