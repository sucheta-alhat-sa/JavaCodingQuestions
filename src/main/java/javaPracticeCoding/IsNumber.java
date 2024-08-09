package javaPracticeCoding;

public class IsNumber {

	public static boolean isNumber(String str) {

		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkNumber(String str) {
		for(int i=0;i<str.length();i++) {
			if(! str.matches("[0-9]+")) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isNumber("845d98"));
		System.out.println(isNumber("1234"));
		System.out.println(checkNumber("94843570"));
		System.out.println(checkNumber("euiwihk9898340"));

//		String str = "34ueriu5";
//		for (int i = 0; i < str.length(); i++) {
////			char c = str.charAt(i);
//			if (! str.matches("[0-9]+")) {
//				System.out.println("false");
//			}
//		}
//		System.out.println("true");

	}

}
