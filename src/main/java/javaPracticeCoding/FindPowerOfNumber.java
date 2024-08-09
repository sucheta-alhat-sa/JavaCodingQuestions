package javaPracticeCoding;

public class FindPowerOfNumber {
	
	public int findPower(int base, int power) {
		int result = 1;
		while(power !=0) { //1!=0
			result= result*base; // 1*2=2 2=2*2  4=4*2  8=8*2  
			--power;//0
		}
		return result;
	}

	public static void main(String[] args) {
		FindPowerOfNumber fp = new FindPowerOfNumber();
		int result = fp.findPower(2, 5);
		System.out.println(result); //32
		
		

	}

}
