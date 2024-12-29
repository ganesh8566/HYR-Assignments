package com.collections;

// Vector....
import java.util.Vector;

public class SumAndAverage1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		int sum = 0;
		int avg = 0;

		v.add(4);
		v.add(5);
		v.add(0);
		v.add(9);
		v.add(8);
		v.add(10);

		for (int i : v) {
			sum += i;
		}
		
//		If we can use for loop than we write the code in below format...
//		for(int i=0;i<v.size();i++){
//			sum += v.get(i);
//		}		
		avg = sum/v.size();
		System.out.println("sum : "+ sum);
		System.out.println("Average : " + avg);
	}

}
