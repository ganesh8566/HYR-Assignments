package com.collections;

// Vector...
import java.util.Scanner;
import java.util.Vector;

public class SumOfEvenNumbers1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of List : ");
		int size = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the Element " + i + " : ");
			v.add(sc.nextInt());
		}

		for (int i : v) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("output : " + sum);
		sc.close();
	}

}
