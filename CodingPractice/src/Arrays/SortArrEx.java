package Arrays;


//bubble sort by rebel guru in youtube
public class SortArrEx {
	/*public static void main(String[] args) {
		int[] arr = {3,2,7,5,12,1,4};
		for(int i =0;i<arr.length;i++){
		System.out.print(arr[i]+" ");	
		}
		System.out.println("\n");
		int temp;
		for(int i =0;i<=arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		}*/
	public static void sortArr(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\n");

        int temp;
		
		for(int i=0;i<arr.length;i++){
			
		for(int j=0;j<arr.length-1;j++){
			
			if(arr[j]>arr[j+1]){
				
				temp = arr[j];      //temp=3---2
				arr[j]=arr[j+1];    //arr[j]=2---7
				arr[j+1]=temp;       //arr[j+1]=3--2
		}
			
		}
        }
		
		for(int i=0;i<arr.length;i++){
			
		System.out.print(arr[i]+" ");	
		}
		}
	
	public static void main(String[] args) {
		
		int arr[]={0,3,2,-1,-9,5,6};
		
		SortArrEx.sortArr(arr);
	}
}
