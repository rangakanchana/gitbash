package Arrays;

public class Linearsearch {
	//Linear search = the elements are not in sequential order	
   public static void main(String[] args) {
	   int arr[]= {12,13,4,67,87,100};
	   int target = 100;
	  int search =  Linearsearch.linearSearch(arr, target);
	  System.out.println("the target element index is :"+search);
		
	}
   public static int linearSearch(int []arr,int target){
	   for(int i =0;i<arr.length;i++){
		   if(arr[i]==target){
			   return i;
		  }
	   }
	   return -1;
	   }
}
