package company_questions;

import java.util.Scanner;

public class SmallLargeInArray {

	public static void smallLarge(int[] ary) {
		int small = ary[0], large = ary[1];
		for (int i : ary) {
			if (i < small) {
				small = i;
			} else if (i > large) {
				large = i;
			}
		}
		System.out.println("Smallest Number = " + small);
		System.out.println("Largest Number = " + large);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Numbers in array = ");
		int n = scanner.nextInt();
		int[] ary = new int[n];
		System.out.print("Enter Element = ");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			ary[i] = num;
		}
		smallLarge(ary);
		scanner.close();
	}

}
