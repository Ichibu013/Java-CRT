package company_questions;

import java.util.HashMap;
import java.util.Scanner;

public class DupliCountUsingHashMap {
	public static void wordCount(String string) {
		String[] words = string.trim().toLowerCase().split("\\s+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			if (!map.containsKey(word)) {
				Integer i = 1;
				map.put(word, i);
			} else {
				Integer countInteger = map.get(word);
				map.replace(word, countInteger += 1);
			}

			// Use getOrDefault to simplify the logic for incrementing counts.
			// If the word is not in the map, it defaults to 0 before adding 1.
			// map.put(word, map.getOrDefault(word, 0) + 1);

		}
		System.out.print("Word Count : ");
		System.out.println(map);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String: ");
		String string = scanner.nextLine();
		wordCount(string);
		scanner.close();
	}
}
