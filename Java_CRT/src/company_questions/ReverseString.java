package company_questions;

import java.util.Scanner;

public class ReverseString {

	// Storing in different array
	public static void reverse(String string) {
		String[] words = string.trim().split("\\s+");
		String[] reverseString = new String[words.length];
		int j = 0;
		for (int i = words.length - 1; i >= 0; i--) {
			reverseString[i] = words[j];
			j++;
		}

		for (String cString : reverseString) {
			System.out.print(cString + " ");
		}

		System.out.println();
	}

	// Displaying directly
	public static void reverseDirect(String string) {
		String[] words = string.trim().split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		System.out.println("With Array: ");
		reverse(str);
		System.out.println("Without Array : ");
		reverseDirect(str);
		sc.close();
	}
}
