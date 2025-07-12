package exceptionHandling;

public class ExceptionHandlingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		int a = 10, b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Arithematic Exception");
		}
		System.out.println("Main Method Ended");
	}

}
