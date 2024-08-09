package javaPrograms;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		n1 = n1+n2; // 10+20 = 30
		n2 = n1-n2; //30-20 = 10
		n1 = n1-n2; //30-10 = 20
		
		System.out.println(n1); //20
		System.out.println(n2); //10

	}

}
