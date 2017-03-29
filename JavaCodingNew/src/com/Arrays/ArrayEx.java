package com.Arrays;

public class ArrayEx {
	
	public static int indexOfMatch(int[] a,int[] b){
        int index=-1;
        if(a.length<b.length){
                return index;
        }
        for(int i=0;i<a.length;i++){
                if(a[i]==b[0]){
                        index=i;

                        for(int j=1;j<b.length;j++){
                                if((i+j)>=a.length || a[i+j]!=b[j]){
                                        index=-1;
                                        break;
                                }
                        }
                        if(index!=-1){
                                return index;
                        }
                }

        }

        return index;
}

public static void main(String[] args) {
        System.out.println(indexOfMatch(new int[]{6,6,6,7},new int[]{6,7}));

}

}
