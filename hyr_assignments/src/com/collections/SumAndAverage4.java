package com.collections;
// LinkedList....
import java.util.LinkedList;
import java.util.Scanner;

public class SumAndAverage4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		System.out.println("Enter the Size of List : ");
		int size = sc.nextInt();
		int sum =0;
		int avg = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("Enter Element " + i +" : ");
			l.add(sc.nextInt());
		}
		
		for(int i : l) {
			sum += i;
		}
		avg = sum/l.size();
		System.out.println("sum : "+ sum);
		System.out.println("Average : " + avg);

		sc.close();
	}

}
