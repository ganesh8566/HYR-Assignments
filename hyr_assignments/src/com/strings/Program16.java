package com.strings;

import java.util.Scanner;

public class Program16 {
	public static StringBuilder removeDuplicates(String s) {
		StringBuilder answer = new StringBuilder("");
		int[] arr = new int[26];
		
		for(int i = 0;i<s.length();i++) {
			int index = s.charAt(i) - 97;
			arr[index] += 1;
			if(arr[index] == 1) {
				answer.append(s.charAt(i));
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String s = sc.nextLine().toLowerCase();
		StringBuilder output = removeDuplicates(s);
		System.out.println("Output : " + output);
		sc.close();
	}

}
