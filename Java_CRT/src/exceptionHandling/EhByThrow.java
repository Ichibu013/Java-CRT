package exceptionHandling;

public class EhByThrow {

	static int divi(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("divide by 0");
		} else
			return a / b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int result = divi(a, b);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
