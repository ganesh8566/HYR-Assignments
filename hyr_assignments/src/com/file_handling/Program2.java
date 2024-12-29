package com.file_handling;

import java.io.File;
import java.io.FileInputStream;

//write a program to find lengthy line in a text file........
public class Program2 {

	public static void main(String[] args) throws Exception {
		File f = new File("./hello.txt");
		FileInputStream fi = new FileInputStream(f);
		int asciiCode;
		String text = new String();

		while ((asciiCode = fi.read()) != -1) {
			text += (char) asciiCode;
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		String[] s = text.split(" ");
		for (int i = 0; i < s.length; i++) {
			if(max < s[i].length()) {
				max = s[i].length();
				index = i;
			}
		}
		System.out.println("Lengthy line in a File : "+s[index]);
		System.out.println("Lengthy line count : "+ s[index].length());

		fi.close();
	}

}
