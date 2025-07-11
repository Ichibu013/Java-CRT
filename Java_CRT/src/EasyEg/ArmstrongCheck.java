package EasyEg;

import java.util.Scanner;

public class ArmstrongCheck {
    public static boolean isArmstrong(int n) {
        int sum = 0, ori = n;
        while (n > 0) {
            int digit = n % 10;                                     //removing single digit
            sum += digit * digit * digit;                           //storing cube in sum
            n /= 10;                                                //removing last digit
        }
        return sum == ori;                                          //returning true or false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println((isArmstrong(n)) ? "Armstrong Number" : "Not Armstrong Number");
        sc.close();
    }
}
