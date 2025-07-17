package company_questions;

import java.util.Scanner;

public class SumOfArrayElements {

	public static int aryAdd(int[] ary) {
		int sum = 0;
		for (int i : ary) {
			sum += i;
		}
		return sum;
	}

	public static int arrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Length of Array : ");
		int n = sc.nextInt();
		int[] ary = new int[n];
		System.out.println("Enter Elements : ");
		for (int i = 0; i < n; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		return aryAdd(ary);
	}

	public static void main(String[] args) {
		System.out.println("Addition : " + arrayInput());
	}

}
