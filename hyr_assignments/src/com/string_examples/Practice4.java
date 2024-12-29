package com.string_examples;
// write a java program to reverse a string...
public class Practice4 {

	public static void main(String[] args) {
		String s = "java is super";
		char[] ch = s.toCharArray();
		
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
