package Examples;

import java.util.Scanner;

public class SubstringCheck {
    public static boolean checkSubstring(String str, String sub) {
        return str.contains(sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a substring: ");
        String sub = sc.nextLine();
        System.out.println(checkSubstring(str, sub) ? "Found" : "Not found");
        sc.close();
    }
}
