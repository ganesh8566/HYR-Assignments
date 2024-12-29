package com.strings;

import java.util.Scanner;

// Write a program to find the first repeated and non-repeated character in the given string.....
public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		System.out.println("Input : "+input);
		char firstRepeatedChar = ' ';
		char firstNonRepeatedChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i != ' ') {
				if(firstNonRepeatedChar == ' ') {
				if (input.indexOf(ch) == input.lastIndexOf(ch)) 
					firstNonRepeatedChar = ch;
				} else if(firstRepeatedChar == ' ') 
					firstRepeatedChar = ch;
				if(firstNonRepeatedChar == ' ' && firstRepeatedChar == ' ')
					break;
			}
		}
		System.out.println("Output");
		System.out.println("First Repeated Character : " + firstRepeatedChar);
		System.out.println("First NonRepeated Character : " + firstNonRepeatedChar);
		sc.close();
	}

}
