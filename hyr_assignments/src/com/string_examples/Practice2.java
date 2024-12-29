package com.string_examples;

// write a java program to count the number of characters in a string....
public class Practice2 {

	public static void main(String[] args) {
		String s = " java is super ";
		String[] split = s.split(" ");
		int count = 0;
		
		for(int i = 1;i<split.length;i++) {
			count++;
		}
		System.out.println("output : " + count);
	}

}
