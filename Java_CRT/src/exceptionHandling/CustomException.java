package exceptionHandling;

@SuppressWarnings("serial")
class toYoungException extends RuntimeException {

	public toYoungException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
		System.err.println(msg);
	}

}

@SuppressWarnings("serial")
class toOldException extends RuntimeException {

	public toOldException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
		System.err.println(msg);
	}

}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 16;
		if (age >= 60) {
			throw new toOldException("To Old to marry .. just retire");
		} else if (age <= 18) {
			throw new toYoungException("Go to jail for asking..");
		} else {
			System.out.println("Thanks for registering!");
		}
	}

}
