package Java8Features.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class startingWithLetterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> namesList = List.of("Ansh", "Aditya", "Amol", "Divesh", "Sakate", "Sanju");
		List<String> presetNames = namesList.stream().filter(name -> name.toLowerCase().charAt(0) == 's')
				.collect(Collectors.toList());
		
		Optional<List<String>> namesOptional = namesList.stream().filter(name -> name.toLowerCase().startsWith("a"))
				.collect(Collectors.collectingAndThen(Collectors.toList(),
						list -> list.isEmpty() ? Optional.empty() : Optional.of(list)));
			
		System.out.println("Using List : " +  (namesList.isEmpty() ? "No Employ with this letter" : presetNames));
		System.out.println("Using Optional  : " + (namesOptional.isEmpty() ? "No Employ with this letter" : namesOptional.get()));
	}

}
