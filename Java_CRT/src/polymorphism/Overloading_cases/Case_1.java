package polymorphism.Overloading_cases;

public class Case_1 {

	public void m1(int i) {
		System.out.println("int method" + i);
	}

	public void m1(float i) {
		System.out.println("float method" + i);
	}

	public static void main(String[] args) {

		Case_1 a = new Case_1();

		a.m1(10);
		a.m1(10.5f);
		a.m1('a');
		a.m1(10l);
		// a.m1(10.5); this gives an complie time error as DOuble is not prometed to
		// next
	}

}
