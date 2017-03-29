package com.array;

public class ArrayExample {
	int largest(int[] arr)
	{
	int largest = arr[0];
	for(int i=1;i<arr.length;i++)
		{
		if(largest < arr[i])
	{
	largest = arr[i];
			}
		}
		return largest;
	}
	int smallest(int[]arr)
	{
		int smallest = arr[0];
		for(int i =1;i<arr.length;i++)
		{
		if(smallest>arr[i])
			{
				smallest = arr[i];
			}
		}
return smallest;
}
	void sortAsc(int[]arr)
	{
	for(int i =0;i<arr.length;i++)
		{
		int temp = arr[0];
	
}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {20,40,70,15,60};

		ArrayExample ex = new ArrayExample();
		int p = ex.largest(arr);
		int q = ex.smallest(arr);
		System.out.println("the smallest no in array is "+q);
		
		System.out.println("the largest number in array is "+p);
	}
	}