package com.string_examples;
// Given the first name and last name, print the last name first then followed by ","
// and first character of the first name.....
public class Practice13 {

	public static void main(String[] args) {
		String firstName = "Nagam";
		String lastName = "Ganesh";
		
		for(int i =0;i<lastName.length();i++) {
			System.out.print(lastName.charAt(i));
		}
		System.out.print("." + firstName.charAt(0));
	}

}
