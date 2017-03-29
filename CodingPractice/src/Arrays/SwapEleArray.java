package Arrays;

public class SwapEleArray {
//swap 67 to 43----index 2 to 5;
	/*public static void main(String[] args) {
int []arr = {1,3,67,32,56,43};
for(int i =0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}
System.out.println("\n");

   int src = 2;
	int des = 5;
	int temp = arr[src];     //temp = 67;
	arr[src] = arr[des];         //src = 43;
	arr[des]=temp;          //des=67;
	
for(int i = 0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}
}
*/
//swap elements 4 and 12;
	public static void swapElements(int arr[]){
		
		int src = 1;
		int des = 4;     //indexes
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("before swaping elements:"+arr[i]);
			
		}
		int temp = arr[src];         //temp=4
		arr[src]= arr[des];          //arr[src]=12
		arr[des] = temp;             //arr[des]=4
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("after swapping elements:"+arr[i]);

		}
		}
	
	public static void main(String[] args) {
		
		int arr[]={2,4,13,65,12,56};
		
		SwapEleArray.swapElements(arr);
	}


	}


