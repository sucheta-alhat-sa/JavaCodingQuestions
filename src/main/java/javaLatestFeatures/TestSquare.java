package javaLatestFeatures;

public class TestSquare {

	public static void main(String[] args) {
		int a = 10;
		Square s = (int x) -> x*x; //implement the calculate method using lambda
		
		int result = s.calculate(a);
		System.out.println(result);
		

	}

}
