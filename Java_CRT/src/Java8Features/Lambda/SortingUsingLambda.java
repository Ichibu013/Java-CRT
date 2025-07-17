package Java8Features.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingLambda {

	public static void main(String[] args) {
		ArrayList<String> namesLambda = new ArrayList<String>();
		namesLambda.add("ansh");
		namesLambda.add("java");
		namesLambda.add("ram");
		namesLambda.add("sham");

		Collections.sort(namesLambda, (s1, s2) -> -s1.compareTo(s2));
		System.out.println("Sorted names (lambda): " + namesLambda);

	}

}
