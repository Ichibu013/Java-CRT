package Examples;

import java.util.Scanner;

public class CharaterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character:");
        String ch = sc.nextLine();

        if (ch.length() > 1) {
            System.out.println("Inputted more than one character");
            return;
        } else if (ch.isEmpty()) {
            System.out.println("Inputted no character");
            return;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == ch.toLowerCase().charAt(0)) {        // Converting string to lower case and comparing with a letter
                count++;                                                            // Increase count if found
            }
        }

        System.out.println("Character " + ch + " occurs " + count + " times");

        sc.close();
    }
}
