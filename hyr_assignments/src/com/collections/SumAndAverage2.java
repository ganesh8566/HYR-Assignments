package com.collections;
// ArrayList.....
import java.util.ArrayList;

public class SumAndAverage2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		int sum = 0;
		int avg = 0;

		a.add(4);
		a.add(5);
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(10);
		
		for (int i = 0; i <a.size(); i++) {
			sum += a.get(i);
		}
		avg = sum/a.size();
		System.out.println("sum : "+ sum);
		System.out.println("Average : " + avg);
	}

}
