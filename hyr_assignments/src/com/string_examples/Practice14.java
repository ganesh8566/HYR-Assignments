package com.string_examples;

// write a java program to print the filename extension in the console...
public class Practice14 {
	public static void main(String[] args) {
		String s = "passport.jpg";
		System.out.println("output : " + s.substring(s.lastIndexOf(".")+1,s.length()));
	}

}
