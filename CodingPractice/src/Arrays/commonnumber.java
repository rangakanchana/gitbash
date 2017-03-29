package Arrays;

public class commonnumber {
	
	public static int[] getCommonElement(int arr1[],int arr2[]){
		
		for(int i=0;i<arr1.length;i++){
			
		for(int j=0;j<arr2.length;j++){
			
		if(arr1[i]==arr2[j]){
			
			System.out.println("the common element between 2 arrays are :"+arr1[i]);
		}
		}
		}
		return arr2;
		}
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {2,3,4,5,6,7};
		
	commonnumber.getCommonElement(arr1,arr2);
		
}

}
