package com.java.dec;

public class SortingArrays {

	public static void main(String[] args) {
		int i;
		int numbers[] = { 1,2,3,4,5,6,7,8,9,10};
		for(i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i]>numbers[j+1]){
					System.out.println();
				}
			}
		}
	}
}

	
/*for (int i = 0; i < numbers.length; i++)
{
       for(int j = 0; j < numbers.length; j++)
       {
                    if(numbers[i] > numbers[j + 1])
                    {
                    }
       }
}*/

