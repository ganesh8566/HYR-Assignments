package com.onedarrays;
// Find the max number from an array and print it along with its index....
public class MaximumNumberFromArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 9, 6 };
		int max = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Value : " + max);
		System.out.println("Index : " + index);
	}

}
