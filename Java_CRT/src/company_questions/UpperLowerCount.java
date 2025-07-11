package company_questions;

import java.util.Scanner;

public class UpperLowerCount {
	static int upper, lower;

	public static void ULCount(String str) {

		for (char c : str.toCharArray()) {
			if (c - 'A' >= 0 && c - 'A' <= 25) { // c >= 'A' && c<='Z'
				upper++;
			} else {
				lower++;
			}

			System.out.println("Upper : " + upper);
			System.out.println("Lower : " + lower);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string = scanner.next();
		ULCount(string);
		scanner.close();
	}

}
