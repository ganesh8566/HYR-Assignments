package com.strings;

import java.util.Scanner;
// Write a java program to count the number of characters in a string..
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input as a String : ");
		String s = sc.nextLine();
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println(count);
		
//		Also we can write Directly
		System.out.println(s.length());
		sc.close();
	}

}
