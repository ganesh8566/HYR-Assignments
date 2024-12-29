package com.twodarrays;

import java.util.Arrays;
import java.util.Scanner;

//Print the sum of the elements of a multi dimensional array
public class SumOfElements2DArrays {

	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows in Array  ");
		int rows_arr1 = sc.nextInt();

		// To take Input from Array 1
		int[][] arr1 = new int[rows_arr1][];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter  Number ofcolumn in Array " + i);
			int col = sc.nextInt();
			arr1[i] = new int[col];
			System.out.println("Enter column values " + i);
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Input 1 ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

		sc.close();
		return arr1;
	}

	public static int sumOfElements(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println();
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] arr = takeInput();
//		int[][] arr = {{1,8,4},{9,7,2},{7,6,4}};
		int sum = sumOfElements(arr);
		System.out.println("Sum of Elements : " + sum);
	}

}
