package Java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class squareNumberUisngStream {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integers ('e' input to stop):");
		while (scanner.hasNextInt()) {
			int e = scanner.nextInt();
			numbers.add(e);
		}
		scanner.close();

		List<Integer> squareNumbersList = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println("Original Numbers : " + numbers);
		System.out.println("Square Numbers : " + squareNumbersList);
	}
}
