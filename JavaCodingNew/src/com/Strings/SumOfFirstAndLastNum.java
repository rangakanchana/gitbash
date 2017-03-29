package com.Strings;


public class SumOfFirstAndLastNum {
	
	public static void sumOFNum(int arr[],int n){
		int sum1 = 0;
		int sum2 = 0;
		int length = arr.length-1;
		                                 //3,2,4,3,5,3,4,4,1
		for(int i=0;i<n;i++){
			
		sum1 = sum1+arr[i];
		sum2 = sum2+arr[length-i];
		}
		if(sum1==sum2){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
		}
	
	public static void main(String[] args) {
		int arr[]={3,2,4,3,5,3,4,4,1};
		
		SumOfFirstAndLastNum.sumOFNum(arr, 2);	
	}
		
}