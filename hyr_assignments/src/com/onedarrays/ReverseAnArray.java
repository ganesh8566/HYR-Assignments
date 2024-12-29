package com.onedarrays;

//Reverse the array and print it in console.....
public class ReverseAnArray {

	public static void main(String[] args) {
		boolean[] arr = { true, false, false, false, true, false, true };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
