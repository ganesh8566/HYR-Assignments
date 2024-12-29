package com.onedarrays;

//Find the Minimum length word from an array and print it along with its index....
public class MinLengthWordFromArray {

	public static void main(String[] args) {
		String[] arr = { "coffee", "water", "chai", "dietcoke" };
		int minLength = Integer.MAX_VALUE;
		int index = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j].length() < minLength) {
				 minLength = arr[j].length();
				 index = j;
			}
		}
		System.out.println("Value : " + arr[index]);
		System.out.println("Index : " + index);
	}

}
