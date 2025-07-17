package company_questions;

import java.util.List;

public class TwoNumberSwap {

	public static void swap(int a, int b) {
		List<Integer> ary = List.of(a, b);
		System.out.println("Reverse Numbers : " + ary.reversed());

		// a = 10 , b = 20
		a = a + b; // 30 -> 10+20
		b = a - b; // 10 -> 30-20
		a = a - b; // 20 -> 30-10
		System.out.println("Correct Logic : ");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		swap(10, 20);
	}

}
