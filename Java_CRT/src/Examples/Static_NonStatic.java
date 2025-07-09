package Examples;

import java.util.Scanner;

public class Static_NonStatic {

    // NOn static - Armstrong number
    public boolean isArmstrong(int num) {
        int sum = 0, ori = num;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == ori;
    }

    // Non Static - Strong number
    public boolean isStrong(int num) {
        int ori = num, sum = 0;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return sum == ori;
    }

    int factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact *= i;
        }
        return fact;
    }

    //static - odd or even
    public static boolean isEvenOdd(int num) {
        return num % 2 == 0;
    }

    //static - prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //static - perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Static_NonStatic obj = new Static_NonStatic();

        while (true) {
            System.out.println("-------------------");
            System.out.println("1. Armstrong number");
            System.out.println("2. Strong number");
            System.out.println("3. Even or odd");
            System.out.println("4. Prime number");
            System.out.println("5. Perfect number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(num + " is " + (obj.isArmstrong(num) ? "an Armstrong number" : "not an Armstrong number"));
                    break;
                case 2:
                    System.out.println(num + " is " + (obj.isStrong(num) ? "a strong number" : "not a strong number"));
                    break;
                case 3:
                    System.out.println(num + " is " + (isEvenOdd(num) ? "an even number" : "an odd number"));
                    break;
                case 4:
                    System.out.println(num + " is " + (isPrime(num) ? "a prime number" : "not a prime number"));
                    break;
                case 5:
                    System.out.println(num + " is " + (isPerfect(num) ? "a perfect number" : "not a perfect number"));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}
