package com.file_handling;

import java.io.File;
import java.io.FileReader;

// write a program to update the existing text into upper case in a text file......
public class Program6 {

	public static void main(String[] args) throws Exception {
		File f = new File("./hello.txt");
		FileReader fr = new FileReader(f);
		String text = "";
		int asciiCode;
		while ((asciiCode = fr.read()) != -1) {
			text += (char) asciiCode;
		}
		System.out.println(text.toUpperCase());

		fr.close();
	}

}
