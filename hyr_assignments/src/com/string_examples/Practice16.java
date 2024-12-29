package com.string_examples;

// Remove Duplicates from a string...
public class Practice16 {

	public static void main(String[] args) {
		String s = "hEeLOlo".toLowerCase();
		StringBuilder answer = new StringBuilder("");
	
		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			arr[index] += 1;
			if (arr[index] == 1) {
				answer.append(s.charAt(i));
			}
		}
		System.out.println(answer.toString());
	}

}
