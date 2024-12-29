package com.twodarrays;

import java.util.Arrays;
import java.util.Scanner;
// Create an Array with Squares of the Existing array elements

public class SqaringOfArray {
	public static void squareOfExistingArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows in Array  : ");
		int row_arr1 = sc.nextInt();
		int[][] arr1 = new int[row_arr1][];

		for (int i = 0; i < row_arr1; i++) {
			System.out.println("Enter Number of Columns " + i);
			int col = sc.nextInt();
			arr1[i] = new int[col];
			System.out.println("Enter  column values " + i);
			for (int j = 0; j < col; j++) {
				arr1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Input1:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

		int[][] outPut = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			outPut[i] = new int[arr1[i].length];
			for (int j = 0; j < arr1[i].length; j++) {
				outPut[i][j] = (int) Math.pow(arr1[i][j], 2);
			}
		}
		
		System.out.println("Output:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(outPut[i]));
		}
		sc.close();
	}


	public static void main(String[] args) {

		squareOfExistingArray();

	}

}
