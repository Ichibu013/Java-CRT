package company_questions;

import java.util.Scanner;

public class ReverseCharacters {

	public static StringBuffer revString(String string) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int j = string.length() - 1; j >= 0; j--) {
			stringBuffer.append(string.charAt(j));
		}
		return stringBuffer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		System.out.println("Reversed String : " + revString(str));
		sc.close();
	}

}
