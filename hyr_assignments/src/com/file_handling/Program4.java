package com.file_handling;

import java.io.File;
import java.io.FileInputStream;

// write a program to find the occurrence of a given word in a text file....
public class Program4 {

	public static void main(String[] args) throws Exception {
		File f = new File("./hello.txt");
		FileInputStream fi = new FileInputStream(f);
		int asciiCode;
		String text = "";
		while ((asciiCode = fi.read()) != -1) {
			text += (char) asciiCode;
		}
		String[] s = text.split(" ");
		String target = "is";
		int count = 0;
		String word = "";

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(target)) {
				word = s[i];
				count++;
			}
		}
		System.out.println("count : " + count);
		System.out.println("Targeted Word : " + word);

		fi.close();

	}

}
