package com.twodarrays;
// create an array based on the mentioned conditions and print it in the console....
public class Program5 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 1 }, { 9, 7, 2 }, { 7, 6, 4 } };
		int[][] arr2 = { { 1, 6, 1 }, { 0, 7, 3 }, { 1, 6, 4 } };
		int[][] output = new int[arr1.length][arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == arr2[i][j])
					output[i][j] = 1;
				else
					output[i][j] = 0;
			}
		}
		for(int[] arr3 : output) {
			for(int arr4 : arr3) {
				System.out.print(arr4 + " ");
			}
			System.out.println();
		}
	}

}
