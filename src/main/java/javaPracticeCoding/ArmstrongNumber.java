package javaPracticeCoding;

public class ArmstrongNumber {
	
	public static void armStrongNumber(int num) {
		//153 ==> 1^3 + 5^3 + 3^3 ==> 1 + 125+27 ==> 153
		if(num<0) {
			System.out.println(num + ":" + "Not Armstrong");
		}else if(num>=0 && num<=9) {
			System.out.println(num + ":" + "Armstrong number");
		}
		
		int rem = 0;
		int sum = 0;
		int copyNum = num;
		
		int power = getPower(num);
		while(num != 0) {
			rem = num % 10; // 3
//			int factor = 1;
//			for(int i =0;i<power;i++) {
//				factor = factor * rem;
//			}
//			sum = sum + factor;
			sum = (int) (sum + Math.pow(rem, power));
			num = num/10;
		}
		
		if(copyNum == sum) {
			System.out.println(copyNum +": "+ "Armstrong");
		}else {
			System.out.println(copyNum + ": " + "Not Armstrong");
		}
	}
	
	public static int getPower(int num) {
		int n = 0;
		while(num != 0) {
			n++;
			num = num/10;
		}
		return n;
	}

	public static void main(String[] args) {
		armStrongNumber(9474);
		armStrongNumber(-1);
		armStrongNumber(0);
		armStrongNumber(345);

	}

}
