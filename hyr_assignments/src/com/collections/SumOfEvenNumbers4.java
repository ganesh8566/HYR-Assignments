package com.collections;

import java.util.LinkedList;

// LinkedList...
public class SumOfEvenNumbers4 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		int sum =0;
		
		l.add(4);
		l.add(5);
		l.add(0);
		l.add(9);
		l.add(8);
		l.add(10);
		
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % 2 == 0)
				sum += l.get(i);
		}
		System.out.println("output : " + sum);
	}

}
