package com.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

// write a program to merge two text files data into a new single text file.......
public class Program5 {

	public static void main(String[] args) throws Exception {
		File f1 = new File(".\\hello.txt");
		FileInputStream fi = new FileInputStream(f1);
		int asciiCode1;
		String text = new String();
		while ((asciiCode1 = fi.read()) != -1) {
			text += (char) asciiCode1;
		}
		System.out.println();

		File f2 = new File("./sample.txt");
		FileReader fr = new FileReader(f2);
		int asciiCode2;
		while ((asciiCode2 = fr.read()) != -1) {
			text += (char) asciiCode2;
		}
		File f = new File("./merge.txt");
		FileOutputStream fo = new FileOutputStream(f);
		
		for(int i=0;i<text.length();i++) {
			fo.write((int)text.charAt(i));
		}
		
		
		fo.close();
		fr.close();
		fi.close();
	}

}
