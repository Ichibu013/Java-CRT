package Java8Features.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinUsingStream {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 5, 13, 7, 8, 9, 10);

		Optional<Integer> Min = numbers.stream().min(Comparator.naturalOrder());
		Optional<Integer> mIntegers = numbers.stream().min((o1, o2) -> Integer.compare(o1, o2));
		Optional<Integer> msIntegers = numbers.stream().min((o1, o2) -> o1.compareTo(o2));

		System.out.println("Using Natural Order : " + Min.get());
		System.out.println("Using Integer.compare() : " + mIntegers.get());
		System.out.println("Using .compareto() : " + msIntegers.get());
	}

}
