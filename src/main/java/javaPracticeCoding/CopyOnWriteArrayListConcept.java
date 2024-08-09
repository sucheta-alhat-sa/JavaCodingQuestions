package javaPracticeCoding;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListConcept {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		list.parallelStream().forEach(list::remove);
		System.out.println(list);

	}

}
