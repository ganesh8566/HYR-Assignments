package com.string_examples;

// write a java program to verify whether the given string is Palindrome or not....
public class Practice15 {

	public static void main(String[] args) {
		String s1 = "JavaJ";
		String output = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			output += s1.charAt(i);
		}
		if (s1.equals(output))
			System.out.println("Its a Palindrome : " + s1);
		else
			System.out.println("Its Not a Palindrome : " + s1);



	}
}
