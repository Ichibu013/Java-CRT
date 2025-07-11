package company_questions;

import java.util.Scanner;

public class addElementArray {

	public static void replaceInArray(int[] ary, int n, int r, int v) {
		int[] newAry = new int[n + 1];
		System.out.println(newAry.length);
		for (int i = 0; i < n; i++) {
			newAry[i] = ary[i];
			if (i >= r) {
				newAry[i + 1] = ary[i];

			}
			newAry[r] = v;
			System.out.println(newAry[i]);
			System.out.println(ary[i]);
		}
		System.out.print("New Array : ");
		for (int i : newAry) {
			System.out.print(" " + i);
		}
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
		System.out.println("Index of Replacement : ");
		int r = scanner.nextInt();
		System.out.println("Value of Replacement : ");
		int v = scanner.nextInt();
		replaceInArray(ary, n, r, v);
		scanner.close();
	}

}
