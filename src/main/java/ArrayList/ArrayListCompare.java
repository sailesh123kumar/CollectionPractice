package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {

		// 1. Sort and then equals

		System.out.println("--------Sort and then equals---------");
		ArrayList<String> ls1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> ls2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> ls3 = new ArrayList<String>(Arrays.asList("D", "F", "A", "B", "C"));

		Collections.sort(ls1);
		Collections.sort(ls2);

		System.out.println("Comparison result of 2 list :" + ls1.equals(ls2));
		System.out.println("Before doing the sorting :" + ls1.equals(ls3));
		Collections.sort(ls3);
		System.out.println("After doing the sorting  :" + ls1.equals(ls3));

		// 2.Compare 2 list and find out additional elements - Actual List
		System.out.println("--------Compare 2 list and find out additional elements---------");

		ArrayList<String> ls4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F")); // Actual List

		ArrayList<String> ls5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E")); // Expected List

		System.out.println("Actual List   :" + ls4);
		System.out.println("Expected List :" + ls5);

		ls4.removeAll(ls5);
		System.out.println("Additional element in the actual list is : " + ls4);

		// 3.Find out the missing element - Expected list
		System.out.println("--------Find out the missing element - Expected list---------");

		ArrayList<String> ls6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F")); // Actual List

		ArrayList<String> ls7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E")); // Expected List

		System.out.println("Actual List   :" + ls6);
		System.out.println("Expected List :" + ls7);

		ls7.removeAll(ls6);
		System.out.println("Missing element in the expected list is : " + ls7);

		// 4.Find Out common elements
		System.out.println("--------Find Out common elements---------");

		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "C#", "Ruby", "JS")); // Actual List

		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "C#", "Ruby", "PHP")); // Expected List

		lang1.retainAll(lang2);
		System.out.println("Common elements between 2 list :" +lang1);
	}

}
