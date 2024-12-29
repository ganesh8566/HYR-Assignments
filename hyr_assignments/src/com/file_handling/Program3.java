package com.file_handling;

import java.io.File;
import java.io.FileReader;

// write a program to find the word count in a text file.......
public class Program3 {

	public static void main(String[] args) throws Exception {
		File f = new File("./hello.txt");
		try (FileReader fr = new FileReader(f);) {
			int asciiCode;
			String text = "";
			while ((asciiCode = fr.read()) != -1) {
				text += (char) asciiCode;
			}
			int count = 0;
			String[] s = text.split(" ");

			for (int i = 0; i < s.length; i++) {
				count++;
			}
			System.out.println("Word Count : " + count);
		} catch (Exception e) {
			throw e;
		}

	}

}
