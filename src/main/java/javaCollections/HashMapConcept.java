package javaCollections;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Max", 100);
		hm.put("Caroline", 200);
		hm.put("Earl", 300);
		hm.put("Oleg", 400);
		
		System.out.println(hm);
		System.out.println(hm.get("Earl"));

	}

}
