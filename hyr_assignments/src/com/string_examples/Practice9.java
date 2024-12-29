package com.string_examples;

// write a java to find the first repeated and non repeated character in the given string...
public class Practice9 {

	public static void main(String[] args) {
		String s = "java is easy";
		s.toLowerCase();
		char firstRepeatedCharacter = ' ';
		char firstNonRepeatedCharacter = ' ';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (firstNonRepeatedCharacter == ' ') {
				if (s.indexOf(c) == s.lastIndexOf(c)) {
					firstNonRepeatedCharacter = c;
				}
			} else if (firstRepeatedCharacter == ' ') {
				firstRepeatedCharacter = c;
			}
			if (firstRepeatedCharacter == ' ' && firstNonRepeatedCharacter == ' ')
				break;
		}

		System.out.println("First Repeated Character : " + firstRepeatedCharacter);
		System.out.println("First NonRepeated Character : " + firstNonRepeatedCharacter);
	}

}
