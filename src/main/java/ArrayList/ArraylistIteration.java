package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIteration {

	public static void main(String[] args) {

		ArrayList<String> sName = new ArrayList<String>();
		
		sName.add("naveen");
		sName.add("suresh");
		sName.add("sailesh");
		sName.add("vignesh");
		sName.add("praggi");
		
		
		//For Loop
		System.out.println("------------FOR LOOP---------------");
		for (int i = 0; i < sName.size(); i++) {
			System.out.println(sName.get(i));
		}
		
		//For Each
		System.out.println("------------FOR EACH---------------");
		for (String s : sName) {
			System.out.println(s);
		}
		
		
		//Streams with Lamda Function = Applicable only after Jdk - 8
		System.out.println("------------STREAM WITH LAMDA FUNCTION---------------");
		sName.stream().forEach(ele -> System.out.println(ele));
		
		//Iterator
		System.out.println("------------ITERATOR---------------");
		Iterator<String> it = sName.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
