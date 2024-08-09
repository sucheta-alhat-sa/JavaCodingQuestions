package javaPracticeCoding;

import java.text.DecimalFormat;

public class CountCharPercentage {
	
	public static void countPercentageChars(String str) {
		int len = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		var specialCharsCount = 0;
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}else if(Character.isDigit(ch)) {
				digitCount++;
			}else {
				specialCharsCount++;
			}
		}
		
		double upperCountPercent = (upperCaseCount * 100)/len;
		double lowerCountPercent = (lowerCaseCount * 100)/len;
		double digitPercent = (digitCount * 100)/len;
		double specialCharPercent = (specialCharsCount * 100)/len;
		
		System.out.println("Given string: " + str);
		DecimalFormat decimal = new DecimalFormat("##.##");
		
		System.out.println("upper case count percent: " + decimal.format(upperCountPercent));
		System.out.println("lower case count percent: " + decimal.format(lowerCountPercent));
		System.out.println("digit count percent: " + decimal.format(digitPercent));
		System.out.println("special char count percent: " + decimal.format(specialCharPercent));
	}

	public static void main(String[] args) {
		countPercentageChars("Selenium Automation Testing#%^12");
		countPercentageChars("%");
		countPercentageChars("A");
		countPercentageChars("12");

	}

}
