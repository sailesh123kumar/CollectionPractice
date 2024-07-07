package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElemets {

	public static void main(String[] args) {

		// 1.Removing Duplicates Using LinkedHashSet
		System.out.println("-------Removing Duplicates Using LinkedHashSet-------");
		ArrayList<Integer> num = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10, 9));

		LinkedHashSet<Integer> unique = new LinkedHashSet<Integer>(num);

		ArrayList<Integer> listwithoutduplicate = new ArrayList<Integer>(unique);

		Iterator<Integer> it = listwithoutduplicate.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println("");
		// 2.Removing Duplicates using stream
		System.out.println("-------Removing Duplicates using streams-------");
		ArrayList<Integer> marklist = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10, 9));

		List<Integer> uniquemark = marklist.stream().distinct().collect(Collectors.toList());

		Iterator<Integer> itmark = uniquemark.iterator();

		while (itmark.hasNext()) {
			System.out.print(itmark.next() + " ");
		}
	}

}
