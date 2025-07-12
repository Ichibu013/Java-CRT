package EasyEg;

import java.util.Scanner;

public class FibonacciSeries {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int sum = 0;
		System.out.println("Fibonacci Series ");
		for (int i = 1; i <= num; i++) {
			sum += i;

			System.out.print(sum + " ");
		}
		input.close();
	}

}
