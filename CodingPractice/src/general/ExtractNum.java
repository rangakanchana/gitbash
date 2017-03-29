package general;

public class ExtractNum {

	
	
public static void sumExtractedNum(String str){
	
    int sum = 0;
    for (char c : str.replaceAll("\\D", "").toCharArray()) {
        int digit = c - '0';
        sum += digit;

}
    System.out.println(sum);

}
//another way
static void sumFromString(String str){
    int sum = 0;
     for(int i = 0; i < str.length() ; i++){
         if( Character.isDigit(str.charAt(i)) ){
             sum = sum + Character.getNumericValue(str.charAt(i));
         }
     }
    System.out.println(sum);
 }

	public static void main(String[] args) {
		String str="ghj78k90";
		//ExtractNum.sumExtractedNum(str);
		ExtractNum.sumFromString(str);
		
	}

}
