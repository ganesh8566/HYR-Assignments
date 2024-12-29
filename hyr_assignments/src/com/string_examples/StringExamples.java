package com.string_examples;

import java.util.Arrays;
// String Methods.......
public class StringExamples {

	public static void main(String[] args) {
		String s1 = " Hello Ganesh,Wecome to Hyderabad ";
		String s2 =  "HELLO GANESH";
		String s3 = "hello ganesh";
		String s4 =  new String("Hello Ganesh");
		String[] arr = {"Ganesh","Warangal","Thanks"};
		String s5 = "456";
		int s6 = 1005;
		
		
		System.out.println(Integer.valueOf(s5));//456
		System.out.println(String.valueOf(s6));//1005
		System.out.println(s2.isEmpty());//false
		
		System.out.println(s2 == s3);//false
		System.out.println(s3 == s4);//false		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.contains("G"));//true
		System.out.println(s3.toUpperCase());//HELLO GANESH
		System.out.println(s1.trim());//Hello Ganesh,Welcome to Hyderabad
		System.out.println(s2.toLowerCase());//hello ganesh
		System.out.println(s1.length());//34
		System.out.println(s3.equalsIgnoreCase(s2));//true
		System.out.println(s3.replace("l","k"));//hekko ganesh
		System.out.println(s2.lastIndexOf("L"));//3
		System.out.println(s2.indexOf("L"));//2
		System.out.println(Arrays.deepToString(arr));//[Ganesh, Warangal, Thanks]	 
		System.out.println(s2.charAt(7));//A
		System.out.println(s1.toCharArray());// Hello Ganesh,Wecome to Hyderabad 
		System.out.println(s2.startsWith("HE"));//true
		System.out.println(s2.endsWith("S"));//false
		System.out.println(s2.substring(3));//LO GANESH
		System.out.println(s2.substring(3,6));//LO 
		System.out.println(s1.split("l"));//[Ljava.lang.String;@372f7a8d
		System.out.println(Arrays.toString(s1.split("l")));//[ He, , o Ganesh,Wecome to Hyderabad ]
	}

}