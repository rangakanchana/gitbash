package com.Arrays;

import java.util.Arrays;


/*An element is said to be leader if all the elements on it’s right side are smaller than it.
Rightmost element is always a leader. 
For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} 
are the leaders in this array.
we assume the last element as highest and we store it in a variable called ‘max‘. 
*/

public class LeaderElements {
	

	
	public static void findLeaders(int[]arr){
		
		
		 //Assuming the last element as leaderElement
	   int leaderElement = arr[arr.length-1];
		
		System.out.println("The leaders in "+Arrays.toString(arr)+" are : ");
		
		//Printing the last element as it is always a leader
		 
        System.out.println(leaderElement);
        
      //Traversing the remaining elements from right to left
        for(int i =arr.length-2;i>=0;i--){
        	
        	 //If the element is greater than max
        	if(arr[i]>leaderElement){
        		//Printing the element
        		System.out.println(arr[i]);
        		 //Updating the max
        		leaderElement=arr[i];
        	}
        }
		
	}
	public static void main(String[] args) {
		
		int[]arr = {6,9,15,1,11,3,10,2};//15,11,10 are the leaders
		//int[]arr1 = {1,4,6,34,7,3,2};
	
		
		findLeaders(arr);
	}
}



