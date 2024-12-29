package com.strings;

public class Practice17 {

	public static void main(String[] args) {
		String s = "Ganesh123";
		char[] c = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				sum += Character.getNumericValue(c[i]);
			}
		}
		System.out.println("Sum: " + sum);
	}

}
