package Arrays;


public class LargestNo {
	 /*public static void main(String[] args) {
	int [] arr = {25,30,43,12,7,98};	
	
    LargestNo large = new LargestNo();
   int num = large.findLargest(arr);
	
	System.out.println("The largest no in given array is: "+ num);

	//25 should be compared with all other numbers,for that we need to put zero index as constant
	}
	public int findLargest(int []arr){
	int largenum = arr[0];        //25
	for(int i=1;i<arr.length;i++){
		
	if(largenum<arr[i]){
	largenum = arr[i];
	}
	}
	return largenum;
	}	*/
		
	public int findLargestNo(int []arr){
		
		int largeNum = arr[0];
		for(int i =1;i<arr.length;i++){
		if(largeNum<arr[i]){
			largeNum = arr[i];
		}
	}
		return largeNum;

	}
	public static void main(String[] args) {
		
		int []arr = {121,45,67,45,12,3,0};
	
        LargestNo largenum = new LargestNo();
		
		int num = largenum.findLargestNo(arr);
		
		System.out.println("the largest no in a given array: "+num);
		}
	
	
	  }