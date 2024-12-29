package com.collections;

import java.util.Stack;

// Stack....
public class SumOfEvenNumbers3 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		int sum = 0;

		s.push(4);
		s.push(5);
		s.push(0);
		s.push(9);
		s.push(8);
		s.push(10);

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i) % 2 == 0)
				sum += s.get(i);
		}
		System.out.println("output : " + sum);
	}

}
