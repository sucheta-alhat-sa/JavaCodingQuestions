package javaPrograms;

import java.util.Arrays;

public class EvenAndOdd {
	
	public static boolean evenOdd(int num) {
		
		if(num %2 == 0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		int num = 1;
		System.out.println(evenOdd(num));
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		//even
		Arrays.stream(arr).filter(e -> e%2 == 0).forEach(System.out::println);
		
		//odd
		Arrays.stream(arr).filter(e ->e%2 !=0).forEach(System.out::println);
	}

}
