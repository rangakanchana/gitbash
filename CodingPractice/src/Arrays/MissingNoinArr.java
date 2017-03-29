package Arrays;


public class MissingNoinArr {
//for missing no;findout sum of total numbers and some of total elements
//find sum of total number of elements in array(sum of n numbers)
public static int sumOfNum(int n){
	int sum = (n*(n+1))/2;
	return sum;
	}
	//find some of total elements in array
public static int sumOfArr(int[]arr){
	int sum = 0;
	for(int i =0;i<arr.length;i++){
		sum= sum+arr[i];
	}
	return sum;
}
public static void main(String[] args) {
	//call the methods---static call by classname
	int n=6;
	int[]arr={1,2,3,4,9};
	int sumofnum = MissingNoinArr.sumOfNum(n);
	int sumofarr = MissingNoinArr.sumOfArr(arr);
	int missingno = sumofnum-sumofarr;
	System.out.println("the missing no in a given array is:"+missingno);
	
	//if array is in sequential order
	/*public static void main(String[] args) {
		int []arr = {1,2,3,4,6};
		for(int i =0;i<arr.length;i++){
			if(arr[i]!=(i+1)){
			System.out.println("the missing no is: "+(i+1));	
			}
		}

	}*/
	
}	
}

