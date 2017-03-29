package com.Strings;

/*binary = 1011
1----1*2power 0---1
1----1*2power 1---2
0----0*2power 2---0
1----1*2power 3---8-----11

*/

public class BinaryToDecimal {
	
  /*  public static int binaryToDecimal(String binary) 
    {
    	int ascii;
    	int num;
    	int count = 0;
    	int decimal = 0;
    	
    	for (int i = binary.length()-1; i >= 0; i--, count++)
    	{
    		ascii = binary.charAt(i); // ascii value of char 0 48 = ascii value of int 0 (48). assign to int
    		num = Character.getNumericValue(ascii);
    		decimal += Math.pow(2, count) * num;
    	}
    	
    	return decimal;
    }*/
    
    public static long binToDecimal(long binary){
    	
    	long decimal = 0;
    	
    	long c=1,i=1;
    	
    	while(binary>0){              //1100>0
    		                          //c=1,1,0,1
    	c= binary%10;
    	
    	decimal = decimal + (c*i);     //1,3,3,11
    	
    	i = i*2;                        //2,4,8,16
    	
    	binary = binary/10;            //101,10,1,0
    		
    		
    	}
    	
    	return decimal;
    	
    	 }
    
         public static void main(String[] args)
	{
		//System.out.println("decimal = " + binaryToDecimal("101001010"));
		//System.out.println("decimal = " + binToDecimal(101001010)); 
		System.out.println("decimal = " + binToDecimal(1011));        
                                     
        	
	}

}
