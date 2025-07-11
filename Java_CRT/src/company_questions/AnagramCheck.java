package company_questions;

import java.util.Scanner;

public class AnagramCheck {

    private static boolean isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s+", "").toLowerCase();  //Removing spaces and converting to lowerCase
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;                   //Assigning index based on ASCII calculation
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Strings are " + (isAnagram(str1, str2) ? "Anagrams" : "Not anagrams"));
        sc.close();
    }
}
