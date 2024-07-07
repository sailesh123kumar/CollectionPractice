package Hashmap;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		Map<String, Integer> Marklist = new HashMap<String, Integer>();
		
		Marklist.put("Naveen", 100);
		Marklist.put("Sailesh", 90);
		Marklist.put("Prathiksha", 99);
		Marklist.put("Viniksha", 120);
		Marklist.put("Esther", 98);
		Marklist.put("Asha", 80);
		
		for (String key : Marklist.keySet()) {
			
			System.out.print("key = " +key+  ",");
			System.out.print(" hash = " +Math.abs(key.hashCode())+  ",");
			System.out.print(" index = " +Math.abs(key.hashCode()) % 15+  ",");
			System.out.println();
			
		}
		
	}

}
