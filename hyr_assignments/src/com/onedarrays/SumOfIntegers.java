package com.onedarrays;
// print the sum of the integers in an integer array....
public class SumOfIntegers {

	public static void main(String[] args) {
		int[] arr = {2,5,1,9,6};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("output : "+sum);
	}

}
