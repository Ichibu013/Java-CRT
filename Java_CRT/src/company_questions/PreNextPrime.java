package company_questions;

import java.util.Scanner;

public class PreNextPrime {

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int previousPrime(int num) {
		while (true) {
			num--;
			if (isPrime(num)) {
				return num;
			}
		}
	}

	public static int nextPrime(int num) {
		while (true) {
			num++;
			if (isPrime(num)) {
				return num;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number => ");
		int num = scanner.nextInt();
		if (isPrime(num)) {
			System.out.println("Previous Prime : " + previousPrime(num));
			System.out.println("Next Prime : " + nextPrime(num));
		} else {
			System.out.println("Number not prime");
		}
		scanner.close();
	}

}
