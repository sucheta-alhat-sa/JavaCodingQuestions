package javaPrograms;

public class FactorialNumber {
	
	public static int facto(int num) {
		//5 ->5x4x3x2x1 = 120
		int result = 1;
		for(int i=1;i<=num;i++) {
			result = i * result; 
		}
		return result;
	}
	
	public static int factoRecur(int num) {
		if(num<=1) {
			return num;
		}else {
			return num * factoRecur(num-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(facto(5)); //120
		System.out.println(factoRecur(5)); //120
	}

}
