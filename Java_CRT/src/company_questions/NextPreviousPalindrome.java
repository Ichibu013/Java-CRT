package company_questions;

import java.util.Scanner;

public class NextPreviousPalindrome {

	public static boolean isPalindrome(int num) {
		int reverse = 0, original = num;
		while (num != 0) {
			reverse += num % 10;
			if (reverse == original) {
				return true;
			} else {
				reverse *= 10;
				num /= 10;
			}
		}
		return false;
	}

	public static int nextPalindrome(int num) {
		while (true) {
			num++;
			if (isPalindrome(num)) {
				return num;
			}
		}
	}

	public static int previousPalindrome(int num) {
		while (true) {
			num--;
			if (isPalindrome(num))
				return num;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scanner.nextInt();
		if (!isPalindrome(num))
			System.out.println("Not Palindrome");
		else {
			System.out.println("Previous Palindrome: " + previousPalindrome(num));
			System.out.println("Next Palindrome: " + nextPalindrome(num));
		}
		scanner.close();
	}

}
