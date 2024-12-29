package com.twodarrays;

import java.util.Arrays;
import java.util.Scanner;

// Add the elements in an Array and Print it in the console
public class SumOfTwoArrays {

	public static void sumOfTwoArrays() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows in Array 1 : ");
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

		System.out.println("Enter Number of Rows in Array 2 : ");
		int row_arr2 = sc.nextInt();
		int[][] arr2 = new int[row_arr2][];

		for (int i = 0; i < row_arr2; i++) {
			System.out.println("Enter the Number of Columns " + i);
			int col = sc.nextInt();
			arr2[i] = new int[col];
			System.out.println("Enter the column values " + i);
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Input1:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

		System.out.println("Input2:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}

		int[][] arr3 = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = new int[arr1[i].length];
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Output:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		sc.close();
	}

	public static void main(String[] args) {
		sumOfTwoArrays();

	}
}
