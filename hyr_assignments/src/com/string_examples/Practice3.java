package com.string_examples;
// write a java program to count the total number of occurrences of a given
// character in a string....
public class Practice3 {

	public static void main(String[] args) {
		String s = "Hello world";
		char target = 'l';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == target)
				count++;
		}
		System.out.println("output : " + count);

	}

}
