package com.Arrays;

public class SecondLargestNo {
	
	public static int findSecondLargeNo(int[]arr){
		
		int firstLargest,secondLargest;
		
		 //Checking first two elements of input array
		if(arr[0]>arr[1]){
			
			//If first element is greater than second element
			firstLargest = arr[0];
			secondLargest = arr[1];
			}else{
			//If second element is greater than first element	
				
			firstLargest = arr[1];
			secondLargest = arr[0];
			}
		 //Checking remaining elements of input array
		for(int i=2;i<arr.length;i++){
			
			if(arr[i]>firstLargest){
				
				secondLargest = firstLargest;
				firstLargest = arr[i];
				
			}else if(arr[i]<firstLargest && arr[i]>secondLargest){
				
				arr[i]=secondLargest;
				
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,45,67,87,43,68};
		
		System.out.println(SecondLargestNo.findSecondLargeNo(arr));
		
	}
	

}
