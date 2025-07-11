package polymorphism.Overloading_cases;

public class Case_2 {

	public void m1(Object o) {
		System.out.println("This is object class");

	}

	public void m1(String s) {
		System.out.println("THis is String method");
	}

	public static void main(String[] args) {

		Case_2 c = new Case_2();

		c.m1(c);
		c.m1("ABC");
		c.m1(null); // herenwe get string ans cause null is default value of string and it convert
					// number to 0
	}

}
