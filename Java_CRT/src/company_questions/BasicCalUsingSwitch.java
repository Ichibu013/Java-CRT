package company_questions;

import java.util.Scanner;

public class BasicCalUsingSwitch {

	static int add(int a, int b) {
		return a + b;
	}

	static int multi(int a, int b) {
		return a * b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int divi(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b = " + b + " : " + "Divide by zero");
		}
		return a / b;
	}

	static int rem(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b = " + b + " : " + "Divide by zero");
		}
		return a % b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number A: ");
		int a = scanner.nextInt();
		System.out.print("Enter Number B: ");
		int b = scanner.nextInt();
		System.out.println("Enter Operation: "
				+ "\n1]Addition"
				+ "\n2]Subraction"
				+ "\n3]Multipication"
				+ "\n4]Divison"
				+ "\n5]Remainder:");
		System.out.print("Enter Choice: ");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Addition: " + add(a, b));
		}
		case 2: {
			System.out.println("Subtarction: " + sub(a, b));
			break;
		}
		case 3: {
			System.out.println("Multiplication: " + multi(a, b));
			break;
		}
		case 4: {
			try {
				System.out.println("Division: " + divi(a, b));
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
		}
		case 5: {
			try {
				System.out.println("Remainder: " + rem(a, b));
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
		}
		default:
			scanner.close();
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		scanner.close();
	}

}
