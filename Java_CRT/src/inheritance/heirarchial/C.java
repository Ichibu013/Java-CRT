package inheritance.heirarchial;

public class C extends A {

	public void said() {
		System.out.println("THis is C");
	}

	public static void main(String[] args) {

		C c = new C();

		c.hello();
		c.said();

	}

}
