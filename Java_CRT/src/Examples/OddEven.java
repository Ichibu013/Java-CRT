package Examples;

import java.util.Scanner;

public class OddEven {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isEven(num) ? "an even number" : "an odd number"));
        sc.close();
    }
}
