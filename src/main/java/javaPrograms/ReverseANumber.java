package javaPrograms;

public class ReverseANumber {
	
	public static int reverseNum(int num) {
		//153 -->351
		int sum = 0;
		int rem = 0;
		while(num != 0) {
			rem = num % 10; //351
			sum = sum *10 + rem;//351
			num = num/10; //0
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(reverseNum(200)); //153

	}

}
