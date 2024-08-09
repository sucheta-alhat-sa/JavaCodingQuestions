package javaPrograms;

public class FibonnaciSeries {
	
	public static void fiboSeries(int num) {
		//0 1 1 2 3 5 8 13 21 34 
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + " " + num2);
		for(int i=1;i<num;i++) {
			num3 = num1+num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
	
	public static int fiboRecursive(int num) {
		if(num <=1) 	
			return num;
		
		return (fiboRecursive(num-1) + fiboRecursive(num-2)); //55
	}

	public static void main(String[] args) {
		fiboSeries(10);
		System.out.println(fiboRecursive(10));

	}

}
