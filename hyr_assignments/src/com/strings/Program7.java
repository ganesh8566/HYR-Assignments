package com.strings;

import java.util.Scanner;
// Write a java program to modify the string in the following pattern....
// Change odd words to Upper case and reverse the even words....
public class Program7 {
	public static String getReverseString(String word) {
		String reverseOrder = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			reverseOrder += word.charAt(j);
		}
		return reverseOrder;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String s = sc.nextLine();

		String[] words = s.split(" ");
		String output = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseOrder = "";
			if (i % 2 == 0)
				output += word.toUpperCase();
			else
				reverseOrder = getReverseString(word);

			if (i != words.length - 1)
				output += reverseOrder + " ";
			else
				output += reverseOrder;

		}
		System.out.println("output : " + output);
		sc.close();
	}

}
