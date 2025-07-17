package Java8Features.Lambda;

@FunctionalInterface
interface evenOdd {
	boolean oddEven(int a);
}

public class EvenNoUsingLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		evenOdd obj = (a) -> a % 2 == 0;
		System.out.println((obj.oddEven(11) ? "Is even" : "Is odd"));
	}

}
