package com.string_examples;

// write a java program to reverse each word of a given string......
public class Practice6 {

	public static void main(String[] args) {
		String s = "java is easy";
		String[] s1 = s.split(" ");
		
		System.out.print("output : ");
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
