package Arrays;


public class MergeArraysEx {
	
	public static int[] mergeArray(int arr1[],int arr2[]){
		
		int arr3[]=new int [arr1.length+arr2.length];
		int k = 0;
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
			k++;
		}
		for(int j=0;j<arr2.length;j++){
			arr3[k]=arr2[j];
			k++;
		}
		for(int i=0;i<arr3.length;i++){
			System.out.println("the merge array is"+arr3[i]);
		}
		return arr3;
		}
	public static void main(String []args){
		int arr1[]={1,2,3,4,5};
		int arr2[]={6,7,8,9,10};
		
		MergeArraysEx.mergeArray(arr1, arr2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*public static void main(String[] args) {
int[]arr1 = {1,2,3,4,5};
int[]arr2 = {6,7,8,9,10};
int[]arr3 = new int[10];   //new int[arr1.length+arr2.length];
int k =0;
for(int i =0;i<arr1.length;i++){
	arr3[i]=arr1[i];
	k++;
}
for(int j =0;j<arr2.length;j++){
	arr3[k]=arr2[j];
	k++;
}
for(int i =0;i<arr3.length;i++){
	System.out.print(arr3[i]+" ");
}
}*/
}
