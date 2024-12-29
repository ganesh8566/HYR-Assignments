package com.collections;

// Stack...
import java.util.Scanner;
import java.util.Stack;

public class SumAndAverage3 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack : ");
		int size = sc.nextInt();
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("Enter Element " + i + " : ");
			s.push(sc.nextInt());
		}

		for (int i : s) {
			sum += i;
		}
		avg = sum/s.size();
		System.out.println("sum : "+ sum);
		System.out.println("Average : " + avg);

		sc.close();

	}

}
