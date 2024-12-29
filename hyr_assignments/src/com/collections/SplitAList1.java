package com.collections;
// Vector....
import java.util.Scanner;
import java.util.Vector;

public class SplitAList1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list : ");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter Element "+i+" : ");
			v.add(sc.nextInt());
		}
		
		sc.close();
	}

}
