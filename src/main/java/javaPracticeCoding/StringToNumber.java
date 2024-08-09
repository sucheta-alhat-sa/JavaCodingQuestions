package javaPracticeCoding;

public class StringToNumber {

	public int stringToNumberMethod(String str) {
		int len = str.length();
		int zeroAsc = (int) '0';
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum * 10 + ((int) str.charAt(i) - zeroAsc);
		}
		return sum;
	}

	public int stringToNum(String str) {
		int zeroAsc = (int) '0';
		char ch[] = str.toCharArray();
		int len = ch.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum * 10 + ((int) ch[i] - zeroAsc);
		}
		return sum;
	}

	public static void main(String[] args) {
		StringToNumber stn = new StringToNumber();
		System.out.println(stn.stringToNumberMethod("12345") + 10);
		System.out.println(stn.stringToNum("234") + 10);

	}

}
