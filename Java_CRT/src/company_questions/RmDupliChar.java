package company_questions;

import java.util.Scanner;

public class RmDupliChar {

	static void dupliInAry(String inputString) {
		StringBuffer resultString = new StringBuffer(); // if used null will get NullPointerException
		for (char c : inputString.toCharArray()) {
			if (resultString.indexOf(String.valueOf(c)) == -1) {
				resultString.append(c);
			}
		}
		System.out.println(resultString);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		dupliInAry(str);
		sc.close();
	}

}
