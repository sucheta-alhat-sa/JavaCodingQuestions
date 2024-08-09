package javaPracticeCoding;

public class AccessingCharacters {
	
	public static void accessChars(String str) {
		System.out.print(str.charAt(10)); //if the charAt() method has out of range index value then it returns the arrayIndexOutofbound exception
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(5));
		System.out.println(String.valueOf(str.charAt(0))); 
		//string.valueOf -->represents the string representation of char value
	}

	public static void main(String[] args) {
		accessChars("HelloWorld");

	}

}
