package EasyEg;

import java.util.Scanner;

public class AddPro {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("sum = " + add(a, b));
		sc.close();
	}
}
