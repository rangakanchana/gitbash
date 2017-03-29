package Strings;

public class StringwithNumbers {

	public static void main(String[] args) {

	String s = "This is nice";
	String s1[]=s.split(" ");
	s1[0]=s1[0]+"1";
	s1[1]=s1[1]+"2";
	s1[2]=s1[2]+"3";
	System.out.println(s1[0]+" "+s1[1]+" "+s1[2]);
}

}
