package com.twodarrays;

import java.util.Arrays;
import java.util.Scanner;

// Interchange the values of an array by Transposing the  index values 
public class TransposingArray {

	public static void transposingArray() {
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
		
		int[][] arr3 = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = new int[arr1[i].length];
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr1[j][i];
			}
		}
		
		System.out.println("Output:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}

		sc.close();
	}
	public static void main(String[] args) {
		transposingArray();
	}

}
