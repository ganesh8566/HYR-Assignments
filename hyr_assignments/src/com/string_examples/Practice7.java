package com.string_examples;
// write a java program to modify the string in the following pattern
// change odd words to upper case and reverse the even words....
public class Practice7 {

	public static void main(String[] args) {
		String s1 = "This is a test String!!";
		String[] s = s1.split(" ");
	//	String output = "";

		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
			//	output += s[i].toUpperCase()+" ";
				System.out.print(s[i].toUpperCase()+" ");
			} else {
				for (int j = s[i].length() - 1; j >= 0; j--) {
			//		output += s[i].charAt(j);
					System.out.print(s[i].charAt(j));
				}
				System.out.print(" ");
			}
		}
	}

}
