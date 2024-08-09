package javaPracticeCoding;

public class CheckAora {
	
	public static void checkAlpha(String str) {
		String s1 = str.toLowerCase();
		char ch = 'a';
		
		s1 = s1.replace(String.valueOf(ch), "");
		System.out.println(s1);
	}
	
	public static void checkAlhpabet(String str) {
		String s1 = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				continue;
			}else {
				s1 += str.charAt(i);
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		String str = "Aeroplane";
		checkAlpha(str);
		checkAlhpabet(str);

	}

}
