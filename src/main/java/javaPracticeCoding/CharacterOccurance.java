package javaPracticeCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurance {

	public static void charCount(String str) {

		// hello world
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> e : set) {
			if (e.getValue() > 1) {
				System.out.println(e + " " + e.getKey());
			}
		}

	}

	public static void main(String[] args) {
		String str = "hello World";
		charCount(str);

	}

}
