package javaPracticeCoding;

public class ReverseString {
	
	public static void stringReverse(String str) {
		//maam
		String reverse = "";
		String strCopy = str;
		for(int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		if(strCopy.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not palindrome");
		}
	}
	

	public static void main(String[] args) {
		String str = "madam";
		stringReverse(str);

	}

}
