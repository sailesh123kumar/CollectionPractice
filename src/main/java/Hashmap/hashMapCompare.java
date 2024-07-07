package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class hashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1.On the basis of key&Value : using equals method
		System.out.println("---------------On the basis of key&Value : using equals method-------------------");
		System.out.println(map1.equals(map2)); // True
		System.out.println(map1.equals(map3)); // False

		// 2.On the basis of keyset : using equals method
		System.out.println("---------------On the basis of keyset : using equals method-------------------");
		System.out.println(map1.keySet().equals(map2.keySet())); // True
		System.out.println(map1.keySet().equals(map3.keySet())); // True

		// 3.Find out the extra keys
		System.out.println("---------------Find out the extra keys-------------------");
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		// Add the keyset from map1
		HashSet<Integer> combinedkey = new HashSet<Integer>(map1.keySet());
		// Add the keyset from map4
		combinedkey.addAll(map4.keySet());

		combinedkey.removeAll(map1.keySet());
		System.out.println(combinedkey);

		// 2.On the basis of value : using equals method
		System.out.println("---------------On the basis of value : using equals method-------------------");
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

		// 1.duplicates are not allowed : using ArrayList
		System.out.println("---------------duplicates are not allowed : using ArrayList-------------------");
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); // True
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); // False

		// 2.duplicates are allowed : using hash set
		System.out.println("---------------duplicates are allowed : using HashSet-------------------");
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // True
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); // True

	}

}
