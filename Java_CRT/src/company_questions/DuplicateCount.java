package company_questions;

import java.util.Scanner;

public class DuplicateCount {

	public static void dcount(String str) {
		char k = 'A';
		int[] Count = new int[26];

		for (char c : str.toCharArray()) {
			Count[c - 'a']++; // Assigning index based on ASCII calculation
		}

		for (int i : Count) {
			if (i >= 1) {
				System.out.println(k + " -> " + i);
			}
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = scanner.next();
		dcount(string);
		scanner.close();
	}

}
