package javaPracticeCoding;

public class CapitalizeStart {

	public static String capiStart(String str) {
		StringBuffer sb = new StringBuffer();

		// hello world
		if (str != null && !str.isEmpty()) {
			String[] str1 = str.split(" ");
			for (String word : str1) {
				sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
			}
			return sb.toString().trim();
		}
		return str;

	}

	public static void capi(String str) {
		String upperCase = "";
		upperCase = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() ;
		System.out.println(upperCase);
	}

	public static void main(String[] args) {
		String result = capiStart("hello world and have a good day today");
		System.out.println(result);

		capi("hello world and have a good day today");

	}

}
