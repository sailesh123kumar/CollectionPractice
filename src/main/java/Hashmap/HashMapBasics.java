package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		// No order - No Indexing
		// Store data in Key,Value format <K,V>
		// Key can not be duplicate
		// can be store n number of null values but it will allow only one null key
		// Hashmap is not thread safe - Unsynchronized
		// store , retriving in map Big O(1) constant time

		HashMap<String, String> CapitalMap = new HashMap<String, String>();

		CapitalMap.put("India", "New Delhi");
		CapitalMap.put("USA", "Washington DC");
		CapitalMap.put("UK", "London");

		System.out.println("=============Printing all key and vaule pair from map===============");
		System.out.println(CapitalMap);

		System.out.println("=============Getting the value by defining the key===============");
		System.out.println(CapitalMap.get("India"));
		System.out.println(CapitalMap.get("USA"));
		System.out.println(CapitalMap.get("UK"));

		System.out.println("=============Getting the value by undefined key===============");
		// If we enter the undefined Key it will return us the null value
		System.out.println(CapitalMap.get("Germany")); // It wont throw any error instead it gives null value

		System.out.println(
				"=============Modifying the existing key and againg Getting the value by defining the key===============");
		CapitalMap.put("UK", "New London");
		System.out.println(CapitalMap.get("UK")); // Latest value will be printed in console

		System.out.println("=============Adding null key and getting the value from map===============");
		CapitalMap.put(null, "Berlin");
		System.out.println(CapitalMap.get(null));
		System.out
				.println("=============Again trying to add the null key and getting the value from map===============");
		CapitalMap.put(null, "LA");
		System.out.println(CapitalMap.get(null)); // It will prints the latest value and it wont allow multiple null key

		System.out.println("=============Adding key and value as null and getting value from map===============");
		CapitalMap.put("France", null);
		CapitalMap.put("Russia", null);
		
		
		


		System.out.println(CapitalMap.get("France"));
		System.out.println(CapitalMap.get("Russia"));

		System.out.println("=============Before Removing :Traversing through map using Iterator===============");

		// Iterator over the keys by using keyset

		Iterator<String> ir = CapitalMap.keySet().iterator();

		while (ir.hasNext()) {
			String key = ir.next();
			String value = CapitalMap.get(key);

			System.out.println("Key = " + key + " and the value = " + value);
		}
		
		System.out.println("=============Remove key and value pair from map uning : remove()- Russia ===============");
		CapitalMap.remove("Russia");

		System.out.println("=============After Removing : Traversing through map using entryset Iterator===============");

		// Iterator over the keys by using keyset and value by using entryset
		Iterator<Entry<String, String>> it = CapitalMap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, String> next = it.next();

			System.out.println("Key = " + next.getKey() + " value = " + next.getValue());

		}
		
		System.out.println("=============After Removing : Traversing through map using lamda===============");
		CapitalMap.forEach((k,v)->System.out.println("key = " +k+ " value = "+v));


	}
}
