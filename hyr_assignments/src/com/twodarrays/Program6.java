package com.twodarrays;
// Interchange the values of an array by transposing the index values.....
public class Program6 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 8, 4 }, { 9, 7, 2 }, { 7, 6, 4 } };
		int[][] output = new int[arr1.length][arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				output[i][j] = arr1[j][i];
			}
		}
		for (int[] arr3 : output) {
			for (int arr4 : arr3) {
				System.out.print(arr4 + " ");
			}
			System.out.println();
		}
	}

}
