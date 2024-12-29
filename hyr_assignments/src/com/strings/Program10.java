package com.strings;

import java.util.Arrays;

public class Program10 {

	public static void main(String[] args) {
		String s = "java is super keka easy and awesome";
		String[] words = s.split(" ");
		String[] output = new String[words.length/2];
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if(i % 2 == 0) {
				output[index] = words[i];
				
			}
		}
		System.out.println(Arrays.toString(output));
	}

}
