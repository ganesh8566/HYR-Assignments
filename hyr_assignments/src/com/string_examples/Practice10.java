package com.string_examples;
// write java program to create an array using word at even positions in a string...
public class Practice10 {

	public static void main(String[] args) {
		String s1 = "java is super keka easy and awesome";
		String[] s = s1.split(" ");

		for (int i = 1 ; i < s.length; i+=2) {
			System.out.print(s[i]);
			System.out.print(" ");
		}
	}
}
