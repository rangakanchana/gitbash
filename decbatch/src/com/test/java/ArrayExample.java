package com.test.java;

public class ArrayExample {
	public int getSmallestNo(int array[]){
		int num = array[0];
		for(int i =1;i<array.length;i++){
			if(num < array[i]){
				num = array[0];
			}
		}
		return num;
	}
	public int getLargestNo(int[]array){
		int	num = array[0];
		for(int i = 1;i<array.length;i++){
			if(num<array[i]){
				num = array[i];
			}
		}
		
		return num;
		
	}
	public static void main(String[] args) {
		
	int [] array = {23,78,91,56,32,34,89};
	
		/*for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}*/
		for(int i=array.length-1;i>+0;i--){
		System.out.println(array[i]);	
		}
		ArrayExample ex = new ArrayExample();
	int e = ex.getLargestNo(array);
	System.out.println("the largest number of the given array is "+e);
	int er = ex.getSmallestNo(array);
	System.out.println("the smallest number of the given array is "+er);
		
	}
	
		
	}	


