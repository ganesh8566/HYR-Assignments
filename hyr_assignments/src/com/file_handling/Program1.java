package com.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Write a program to find the numbers of lines present in a text file...
public class Program1 {

	public static void main(String[] args) throws Exception {
		File f = new File(".\\hello.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		int count = 0;
		
		while(bf.readLine() != null) {
			count++;
		}	
		System.out.println("Lines : " + count);
		bf.close();
	}

}
