package Java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evevOddUsingStream {

	public static void main(String[] args) {
		// To make list using List.Of
		// List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Numbers List : " + numbers);

		// Use collect - Collectors to collect item from stream to display
		List<Integer> evenList = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers using collect method : " + evenList);

		// Use forEach to display single elements form stream +
		// num -> System.out.print(num + " ") -> we can use this place of
		// System.out::println
		// Double Resolution Operation[::] is java 8 feature to call methods
		System.out.println("Odd Numbers using forEcah method : ");
		numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

	}

}
