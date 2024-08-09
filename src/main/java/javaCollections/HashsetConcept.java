package javaCollections;

import java.util.HashSet;

public class HashsetConcept {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Rachel");
		hs.add("Ross");
		hs.add("Chandler");
		hs.add("Phoebe");
		hs.add("Joey");
		
		System.out.println(hs); // [Phoebe, Rachel, Joey, Ross, Chandler]
		System.out.println(hs.contains("Ross")); //true

	}

}
