package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList is the default class
		// Dynamic Array

		// ArrayList declaration methods
		// 1. Default Generics

		// ArrayList ar=new ArrayList(); //It will throw as warning as RawType but still we can use it
		ArrayList<Object> ar = new ArrayList<Object>(); // We may define the generics

		ar.add(100);
		ar.add(300);
		ar.add(12.33);
		ar.add("sailesh");
		ar.add('c');
		ar.add(true);
		System.out.println("----------PRINT ARRAY LIST-----------");

		System.out.println(ar);

		System.out.println("----------GET-----------");

		System.out.println(ar.get(3));

		// Out of bound excjeption
		// System.out.println(ar.get(-1));
		// System.out.println(ar.get(6));

		System.out.println("----------GET SIZE-----------");
		System.out.println(ar.size());
		System.out.println("Lowest Index : " + 0);
		System.out.println("Highest Index : " + ar.size());
		ar.add(600);
		ar.add(400);
		System.out.println(ar.size());
		
		
		System.out.println("----------GENERAATING LIST FROM OTHER COLLECTIONS-----------");
		//List with other collections
		
		ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(al);
		

	}

}
