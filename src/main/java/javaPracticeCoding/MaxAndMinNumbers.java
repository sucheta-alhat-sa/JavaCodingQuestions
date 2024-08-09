package javaPracticeCoding;

public class MaxAndMinNumbers {
	
	public static void maxNumbers(int a, int b, int c) {
		int max = 0;
		while(a>0 || b>0 || c>0) {
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println(max);
	}
	
	public static void minNumber(int a, int b, int c) {
		int min = 0;
		while(a>0 && b>0 && c>0) {
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		maxNumbers(100, 200, 300);
		maxNumbers(1, 0, 3);
		minNumber(0, 2, 3);
		minNumber(10, 7, 1);
		

	}

}
