package com.twodarrays;
// create an array with squares of the existing array elements.....
public class Practice3 {

	public static void main(String[] args) {
		int[][] arr = { { 2, 3, 5 }, { 0, 1, 3 }, { 1, 2, 4 } };
		int[][] output = new int[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				output[i][j] = (int)Math.pow(2,arr[i][j]);
			}
		}
		for (int[] arr1 : output) {
			for (int arr2 : arr1) {
				System.out.print(arr2 + " ");
			}
			System.out.println();
		}
	}

}
