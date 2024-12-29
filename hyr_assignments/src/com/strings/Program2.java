package com.strings;

import java.util.Scanner;
// Write a java program to count the Number of words in a string..
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String input = sc.nextLine();
		
		String[] s = input.split(" ");
		System.out.println(s.length);
		sc.close();
	}

}
