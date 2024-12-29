package com.onedarrays;

// Merge two arrays and print the output in the console....
public class MergeTwoArrays {

	public static void main(String[] args) {
		String[] arr1 = {"chai","coffee"};
		String[] arr2 = {"milk","water","coke"};
					
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<arr1.length;i++) {
			sb.append(arr1[i] + " ");
		}
		
		for(int i=0;i<arr2.length;i++) {
			sb.append(arr2[i] + " ");
		}
		System.out.println("Output : "+ sb);

	}


}
