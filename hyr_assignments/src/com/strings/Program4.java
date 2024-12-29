package com.strings;

import java.util.Scanner;

// Write a java program to Reverse a String...
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String s = sc.nextLine();
		
		char[] c= s.toCharArray();
		
		for (int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		sc.close();
	}

}
