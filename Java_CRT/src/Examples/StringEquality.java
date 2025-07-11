package Examples;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() >= 2) {
            String s1 = str.substring(0, 1);                                    // extracting the fist letter
            String s2 = str.substring(str.length() - 1);              // extracting the last letter
            if (s1.equals(s2)) {
                System.out.println("First and last characters are equal");
            } else {
                System.out.println("First and last characters are not equal");
            }
        } else {
            System.out.println("The string is too short");
        }

        sc.close();
    }
}
