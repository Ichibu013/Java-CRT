package Examples;

import java.util.Scanner;

public class BiggestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int firstBiggest = 0;
        int secondBiggest = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit > firstBiggest) {
                secondBiggest = firstBiggest;                                           // Assigning previous biggest value to secondBiggest
                firstBiggest = lastDigit;                                               // Assigning new biggest
            } else if (lastDigit > secondBiggest && lastDigit != firstBiggest) {
                secondBiggest = lastDigit;                                              // If found nex
            }

            number /= 10; // Eliminate the last digit
        }

        System.out.println("Second biggest digit: " + secondBiggest);

        sc.close();
    }
}