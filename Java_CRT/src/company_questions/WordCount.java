package company_questions;

import java.util.Scanner;

public class WordCount {

	public static void wCount(String string) {
		String[] words = string.trim().split("\\s+");

		int count = words.length;

		System.out.println("Words in String : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = scanner.nextLine();
		wCount(string);
		scanner.close();
	}

}
