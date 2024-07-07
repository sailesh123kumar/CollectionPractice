package ArrayList;

import java.util.ArrayList;

public class VirtualCapacityofArrayList {
	
	public static void main(String[] args) {
		
		//By default virtual capacity of arraylist = 10
		//Physical capacity = 0
		
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size()); //PC=0
		ar.add(100);
		System.out.println(ar.size()); //PC=1
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size()); //PC=4
		
	}

}
