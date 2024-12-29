package com.strings;

import java.util.Scanner;

// Write a java Program to find the count of Upper case letters,lower case letters,
// digits and special characters in a given string......
public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String s = sc.nextLine();
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitsCount = 0;
		int charactersCount = 0;

		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(ch[i]))
				upperCaseCount++;
			else if(Character.isLowerCase(ch[i]))
				lowerCaseCount++;
			else if(Character.isDigit(ch[i]))
				digitsCount++;
			else
				charactersCount++;
		}
		System.out.println("UpperCaseCount : "+upperCaseCount);
		System.out.println("LowerCaseCount : "+lowerCaseCount);
		System.out.println("DigitsCount : "+digitsCount);
		System.out.println("CharactersCount : "+charactersCount);
		sc.close();
	}

}
