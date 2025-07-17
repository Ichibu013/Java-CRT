package Java8Features.Lambda;

@FunctionalInterface
interface Addition {
	void add(int a, int b);
}

public class AddUsingLambda {

	public static void main(String[] args) {
		Addition objAddition = (a, b) -> System.out.println(a + b);
		objAddition.add(10, 10);
	}

}
