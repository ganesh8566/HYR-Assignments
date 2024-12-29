package com.onedarrays;
// print the average of the integers in an array.....
public class AverageOfIntegers {

	public static void main(String[] args) {
		int[] arr = {2,5,3,9,6};
		int sum = 0;
		
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Output : "+(sum/arr.length));
	}

}
