package EasyEg;

import java.util.Scanner;

public class N_Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to be added: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " : ");
			int a = sc.nextInt();
			sum += a;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}
}
