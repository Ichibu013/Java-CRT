package Java8Features.stream;

import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 5, 13, 7, 8, 9, 10);
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);
	}
}
