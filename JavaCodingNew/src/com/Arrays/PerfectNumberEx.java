package com.Arrays;


public class PerfectNumberEx {
	
	public static boolean isPerfectNo(int n){
		
		 int  sum = 0;
		 for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is Perfect Number");
	            return true;
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect Number");
	            
	            return false;
	        } 
		}
	
	 public static void main(String[] args) 
	    {
	     
		 PerfectNumberEx.isPerfectNo(10);
		 
		 
}
}
