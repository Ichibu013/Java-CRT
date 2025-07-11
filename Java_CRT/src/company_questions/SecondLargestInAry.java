package company_questions;

import java.util.Scanner;

public class SecondLargestInAry {

	public static int secLargest(int[] ary) {
		int first = 0, second = 0;
		for (int i : ary) {
			if (i > first) {
				second = first;
				first = i;
			} else if (i > second && i != first) {
				second = i;
			}
		}
		return second;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Numbers in array = ");
		int n = scanner.nextInt();
		int[] ary = new int[n];
		System.out.print("Enter Element = ");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			ary[i] = num;
		}
		System.out.println("Second Largest = " + secLargest(ary));
		scanner.close();
	}
}
