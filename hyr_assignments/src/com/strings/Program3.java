package com.strings;

import java.util.Scanner;

// write a java program to count the total number of occurrences of a given character in a string..
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in String : ");
		String s = sc.nextLine();
		
		System.out.println("Enter Target : ");
		char target = sc.next().charAt(0);
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(target == s.charAt(i))
				count++;
		}
		System.out.println(" Target Input : " + target);
		System.out.println("Input : " + s);
		System.out.println("OutPut : " +count);
		
		//Another Method
		char[] c = s.toCharArray();
		
		for(int i =0;i<c.length;i++) {
			if(c[i] == target)
				count++;
		}
		System.out.println("OutPut : "+count);

		sc.close();
	}

}
