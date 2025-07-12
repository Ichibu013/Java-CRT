package company_questions;

public class TwoWordSwap {

    public static void twoSwap(String string) {
        String[] words = string.trim().split("\\s+");

        // Swap only if there are at least 2 words
        if (words.length >= 2) {
            String temp = words[0];
            words[0] = words[1];
            words[1] = temp;
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] args) {
        twoSwap("Hello World");
    }
}
