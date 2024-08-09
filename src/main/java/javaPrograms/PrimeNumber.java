package javaPrograms;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 17;
		System.out.println(isPrime(num));
		
		
		
		

	}

}
