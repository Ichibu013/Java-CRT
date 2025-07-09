package polymorphism.Overloading_cases;

public class Case_3 {

	public void m1(StringBuffer o) {
		System.out.println("This is object class");

	}

	public void m1(String s) {
		System.out.println("THis is String method");
	}

	public static void main(String[] args) {

		Case_3 c = new Case_3();

		c.m1(new StringBuffer("XYZ"));
		c.m1("ABC");
		// c.m1(null); // it gives error as complier get confuse ki kisko assign kru
		// value as they both have byDefault value null

	}

}
