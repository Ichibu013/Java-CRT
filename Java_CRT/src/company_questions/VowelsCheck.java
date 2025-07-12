package company_questions;

import java.util.Scanner;

public class VowelsCheck {

	public static boolean isVowel(char ch) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char vowel : vowels) {
			if (ch == vowel) {
				return true;
			}
		}
		return false;
	}

	static void count(String string) {
		boolean[] counted = new boolean[5];
		int i = 0;
		System.out.println("Vowels : ");
		for (char c : string.toCharArray()) {
			if (isVowel(c) && !counted[i]) {
				System.out.print(c + " ");
				counted[i] = true;
				i++;
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.nextLine();
		count(str);

		System.out.print("Enter Charater : ");
		char c = sc.next().charAt(0);
		System.out.println(isVowel(c) ? "Is Vowel" : "Is not Vowel");

		sc.close();

	}

}
