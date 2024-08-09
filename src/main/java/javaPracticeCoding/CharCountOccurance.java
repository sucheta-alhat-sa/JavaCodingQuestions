package javaPracticeCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCountOccurance {

	public static void main(String[] args) {
		String str = "aaAAbbbBBcccCCdDeeeeEE";
		
		char ch[] = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> s1 = map.entrySet();
		
		for(Entry<Character, Integer> e1 : s1) {
			if(e1.getValue()>1) {
				System.out.println(e1+ ":" + e1.getKey());
			}
		}

	}

}
