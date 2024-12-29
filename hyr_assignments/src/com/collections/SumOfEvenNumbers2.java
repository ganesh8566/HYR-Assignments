package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList...
public class SumOfEvenNumbers2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of List : ");
		int size = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the Element " + i + " : ");
			a.add(sc.nextInt());
		}

		for (int i : a) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("output : " + sum);
		sc.close();
	}

}
