package com.string_examples;
// write a java program to find the max length-word in a given string (if two words
// are of same length then return the first occurring word of max-length)...... 
public class Practice11 {

	public static void main(String[] args) {
		String s1 = "hello how are you Mooommmm";
		String[] s = s1.split(" ");
		int output = 0;
		int maxLength = Integer.MIN_VALUE;
		for (int i = 0; i < s.length; i++) {
			if(maxLength < s[i].length()) {
				maxLength = s[i].length();
				output = i;
			}
		}
		System.out.println("output : "+s[output]);
	}

}
