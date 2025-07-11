package polymorphism.Overloading_cases;

class A {
	int a;
	double b;
	String c;

	public A() {
		a = 101;
		b = 12.34;
		c = "Ansh";
	}

	public A(int x) {
		a = x;
	}

	public A(double x, String y) {
		b = x;
		c = y;
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a0 = new A();
		A a1 = new A(10);
		A a2 = new A(1.23, "Test");
		System.out.println(a0.a + " " + a0.b + " " + a0.c);
		System.out.println(a1.a + " " + a1.b); // Only calls A(int x) constructor thus 0.0
		System.out.println(a2.b + " " + a2.c);
	}

}
