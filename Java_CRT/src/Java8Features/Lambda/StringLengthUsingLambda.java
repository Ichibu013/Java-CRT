package Java8Features.Lambda;

@FunctionalInterface
interface sLength {
	void sLengthL(String string);
}

public class StringLengthUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sLength objLength = (string) -> System.out.println("Length of string :" + string.length());
		objLength.sLengthL("Hello world");
	}

}
