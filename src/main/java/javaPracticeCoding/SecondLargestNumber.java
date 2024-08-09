package javaPracticeCoding;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] numbers = {5,3,9,7,2,8};
		
		var result = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).mapToInt(Integer::intValue).findFirst();
		
		result.ifPresentOrElse(value -> System.out.println(value), () -> {throw new IllegalArgumentException("Array too small");});

	}

}
