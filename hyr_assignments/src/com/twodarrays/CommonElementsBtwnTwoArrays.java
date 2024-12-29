package com.twodarrays;

import java.util.Arrays;
//import java.util.Scanner;

public class CommonElementsBtwnTwoArrays {
	
	public static void printCommonElements() {
		int[][] arr1 = { { 1, 2, 1 }, { 9, 7, 2 }, { 7, 6, 4 } };
		int[][] arr2 = { { 2, 6, 8, 6 }, { 0, 1, 3, 9, 7 }, { 7, 2, 0 }, { 8, 3 } };

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number of Rows in Array 1 : ");
//		int row_arr1 = sc.nextInt();
//		int[][] arr1 = new int[row_arr1][];
//
//		for (int i = 0; i < row_arr1; i++) {
//			System.out.println("Enter Number of Columns " + i);
//			int col = sc.nextInt();
//			arr1[i] = new int[col];
//			System.out.println("Enter  column values " + i);
//			for (int j = 0; j < col; j++) {
//				arr1[i][j] = sc.nextInt();
//			}
//			System.out.println();
//		}
//
//		System.out.println("Enter Number of Rows in Array 2 : ");
//		int row_arr2 = sc.nextInt();
//		int[][] arr2 = new int[row_arr2][];
//
//		for (int i = 0; i < row_arr2; i++) {
//			System.out.println("Enter the Number of Columns " + i);
//			int col = sc.nextInt();
//			arr2[i] = new int[col];
//			System.out.println("Enter the column values " + i);
//			for (int j = 0; j < col; j++) {
//				arr2[i][j] = sc.nextInt();
//			}
//			System.out.println();
//		}

		System.out.println("Input1:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println();

		System.out.println("Input2:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		System.out.println();
		System.out.println("Output:");
		
		//int arr3[] = {};
		//boolean isFound = false;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				//int target = arr1[i][j];
				for (int k = 0; k < arr2.length; k++) {
					//isFound = false;
					for (int l = 0; l < arr2[k].length; l++) {
						//target == 
						if (arr1[i][j] == arr2[k][l]) {							
							System.out.print(arr1[i][j] + " ");
							//arr3[] = arr1[i][j];
							//isFound = true;
							//break;
						}
					}
					//if(isFound)
					//	break;
				}
			}
		}
		//sc.close();
	}

	public static void main(String[] args) {
//		int[][] arr1 = { { 1, 2, 1 }, { 9, 7, 2 }, { 7, 6, 4 } };
//		int[][] arr2 = { { 2, 6, 8, 6 }, { 0, 1, 3, 9, 7 }, { 7, 2, 0 }, { 8, 3 } };
		printCommonElements();
	}

}
