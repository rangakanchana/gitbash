import java.util.ArrayList;

public class ArrayListEx1 {
		
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(15);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(9);
		list.add(10);
			for(Integer i : list){
				if(i%3==0){
					System.out.println(i);
					}
			}
}

}
