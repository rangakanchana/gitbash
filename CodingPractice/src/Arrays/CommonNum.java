package Arrays;

public class CommonNum {

	
	public static int[] findCommonElement(int arr1[],int arr2[]){
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]+" ");
				}
				
			}
		}
		return arr2;
	}
	
public static void main(String[] args) {


	int []arr1 = {12,6,45,98,46,80};
	int []arr2 = {6,80,43,97,81,42};
	
	CommonNum.findCommonElement(arr1, arr2);
	
	
	
	
	/*for(int i =0;i<arr1.length;i++){
		for(int j =0;j<arr2.length;j++){
			if(arr1[i]==arr2[j]){

				System.out.print(arr1[i]+" ");
			}
		}
	}
		*/
}
}

