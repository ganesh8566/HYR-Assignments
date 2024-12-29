package com.string_examples;

public class Practice8 {
	public static void main(String[] args) {
		String s = "JavA5is&Su6p%eR";
		int upperCaseLettersCount = 0;
		int lowerCaseLettersCount = 0;
		int digitsCount = 0;
		int specialCharactersCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
				upperCaseLettersCount++;
			else if(Character.isLowerCase(s.charAt(i)))
				lowerCaseLettersCount++;
			else if(Character.isDigit(s.charAt(i)))
				digitsCount++;
			else
				specialCharactersCount++;
				
		}

		System.out.println("Upper Case Letters Count : " + upperCaseLettersCount);
		System.out.println("Lower Case Letters Count : " + lowerCaseLettersCount);
		System.out.println("Digit Count : " + digitsCount);
		System.out.println("Special Character Count : " + specialCharactersCount);
	}
}
