package company_questions;

import java.util.Scanner;

public class ArraySort {

	public static void sortArt(int[] ary) {
		int temp = 0;
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - 1 - i; j++) {
				if (ary[j] > ary[j + 1]) {
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}
		}

		System.out.print("Sorted Array: ");
		for (int i : ary) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Length of the array: ");
		int l = scanner.nextInt();
		int[] ary = new int[l];
		System.out.println("Enter " + l + " elements:");
		for (int i = 0; i < l; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			int e = scanner.nextInt();
			ary[i] = e;
		}

		sortArt(ary);

		scanner.close();
	}
}