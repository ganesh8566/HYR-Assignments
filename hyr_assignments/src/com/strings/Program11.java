package com.strings;

public class Program11 {

	public static void main(String[] args) {
		String s = "hello how are you mooommmm";
		String[] words = s.split(" ");
		String longestWord = words[0];
		int maxLength = longestWord.length();

		for (int i = 1; i < words.length; i++) {
			
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
				longestWord = words[i];
			}
		}
		System.out.println("Largest String : " + longestWord);
	}

}
