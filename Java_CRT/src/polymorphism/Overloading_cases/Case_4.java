package polymorphism.Overloading_cases;

//var-arg method
public class Case_4 {

	public void m1(int i) {
		System.out.println("sinngle argument / general method");
	}

	public void m1(int... i) {
		System.out.println("variable argument method / var-arg method");
	}

	public static void main(String[] args) {

		Case_4 a = new Case_4();

		a.m1(); // var-arg method cause 0 is also considered from 0-infinity
		a.m1(10, 20); // var-arg

	}

}
