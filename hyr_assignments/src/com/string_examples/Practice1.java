package com.string_examples;

// write a java program to count the number of characters in a string...
public class Practice1 {

	public static void main(String[] args) {
		String s = "java is super";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println("output : " + count);
	}

}
