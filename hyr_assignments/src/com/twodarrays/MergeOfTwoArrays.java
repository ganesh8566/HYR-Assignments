package com.twodarrays;

import java.util.Scanner;

public class MergeOfTwoArrays {
	static Scanner sc = new Scanner(System.in);

	public static String[] readStrings(int size) {
		String[] s = new String[size];
		for (int i = 0; i < s.length; i++) {
			System.out.print("Enter the Name : ");
			s[i] = sc.nextLine();
		}
		return s;
	}

	public static void mergeOfTwoArrays(String[] s1, String[] s2) {
		StringBuilder sb = new StringBuilder();
		for (String s : s1) {
			sb.append(s+" ");
		}
		for (String s : s2) {
			sb.append(s+" ");
		}
		String result = sb.toString();
		System.out.println("Merged Array : " + result);
	}

	public static void main(String[] args) {
		System.out.print("Enter the Size of Array 1 : ");
		int size1 = sc.nextInt();
		sc.nextLine();
		String[] s1 = readStrings(size1);

		System.out.print("Enter the Size of Array 2 : ");
		int size2 = sc.nextInt();
		sc.nextLine();
		String[] s2 = readStrings(size2);

		mergeOfTwoArrays(s1, s2);
		sc.close();
	}

}
