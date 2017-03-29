package Arrays;

public class BinarySearchEx {
	//binary search means elements are in sequential order
//hence we can take mid index and compare target value
	//int[]arr={12,14,16,20,22}----target = 14 and 20(second ex)
	
	public static int binarySearch(int[]arr,int target){
		int firstindex = 0;
		int lastindex = arr.length-1;
		while(firstindex<=lastindex){
			int midindex = (firstindex+lastindex)/2;
			if(target<arr[midindex]){
			lastindex = midindex-1;	
			}else if(target==arr[midindex]){
				return midindex;
			}else{
				firstindex=midindex+1;
			}
		}
		return -1;
		}
	public static void main(String[] args) {
		int[]arr={12,14,16,20,22};
		int target = 20;
		int search = BinarySearchEx.binarySearch(arr, target);
		if(search!=-1){
			System.out.println("the search element is in index; "+search);
		}else{
			System.out.println("the search element is not exists");
		}
	}
}
