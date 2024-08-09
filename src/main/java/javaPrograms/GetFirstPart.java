package javaPrograms;

public class GetFirstPart {
	
	public static void firstPart(String str) {
		if(! str.contains(",")) {
			System.out.println("NONE");
		}else {
			String[] s1 = str.split(",");
			System.out.println(s1[0]);
		}
	}

	public static void main(String[] args) {
		firstPart("no first part, OR IS IT?");
		firstPart("rerer");
	}

}
