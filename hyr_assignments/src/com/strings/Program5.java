package com.strings;

import java.util.Scanner;
// Write a java program to remove all starting and ending spaces from a string...
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String s = sc.nextLine();
		System.out.println(s.trim());
		sc.close();
	}

}
